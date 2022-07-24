package com.dojinyou.allfordev.refactoring.refactoring3;

import java.util.ArrayList;
import java.util.List;

public class User {
  private int money;
  private final Store store;
  private List<Product> belongs = new ArrayList<>();

  public User(int money,  Store store) {
    this.money = money;
    this.store = store;
  }

  public Product seeProduct(long productId) {
    return store.showProduct(productId);
  }

  public Product purchaseProduct(long productId) {
    Product product = seeProduct(productId);
    if (money >= product.getPrice()) {
      store.giveProduct(productId);
      money -= product.getPrice();
      store.takeMoney(product.getPrice());
      belongs.add(product);
      return product;
    }
    else {
      throw new RuntimeException("잔돈이 부족합니다.");
    }
  }

  public String getBelongs() {
    return belongs.toString();
  }
}

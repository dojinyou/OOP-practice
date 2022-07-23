package com.dojinyou.allfordev.refactoring4;

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
    int productPrice = product.getPrice();
    if (money >= productPrice) {
      giveMoney(productPrice);
      try {
        store.sellProduct(productId, productPrice);
      } catch (Exception e) {
        takeMoney(productPrice);
        System.out.println("구매 중 에러가 발생하였습니다.");
      }

      addProduct(product);
      return product;
    }
    else {
      throw new RuntimeException("잔돈이 부족합니다.");
    }
  }

  private void addProduct(Product product) {
    belongs.add(product);
  }

  private void takeMoney(int productPrice) {
    money += productPrice;
  }

  private void giveMoney(int productPrice) {
    money -= productPrice;
  }

  public String getBelongs() {
    return belongs.toString();
  }
}

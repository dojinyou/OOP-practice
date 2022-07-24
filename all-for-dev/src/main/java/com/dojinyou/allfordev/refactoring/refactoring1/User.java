package com.dojinyou.allfordev.refactoring.refactoring1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
  private int money = 0;
  private final Store store = new Store();
  private List<Product> belongs = new ArrayList<>();

  public Product seeProduct(long productId) {
    Map<Long, Product> products = store.getProducts();
    return products.get(productId);
  }

  public void purchaseProduct(long productId) {
    Product product = seeProduct(productId);
    if (money >= product.getPrice()) {
      store.getProducts().remove(productId);
      money -= product.getPrice();
      store.setMoney(product.getPrice());
      belongs.add(product);
    }
    else {
      throw new RuntimeException("잔돈이 부족합니다.");
    }
  }
}

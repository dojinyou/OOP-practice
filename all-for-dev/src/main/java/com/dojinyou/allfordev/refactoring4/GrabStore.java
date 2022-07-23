package com.dojinyou.allfordev.refactoring4;

import java.util.Map;

import lombok.Getter;

@Getter
public class GrabStore extends Store {
  private int money = 0;
  private final String name = "dojin";
  private final Map<Long, Product> products;

  public GrabStore(Map<Long, Product> products) {
    this.products = products;
  }

  @Override
  public Product showProduct(long productId) {
    return products.get(productId);
  }

  @Override
  public Product sellProduct(long productId, int money) {
    Product product = showProduct(productId);

    if (product == null) {
      throw new RuntimeException("상품이 존재하지 않는다.");
    }

    takeMoney(money);
    try {
      takeOutProduct(productId);
    } catch (Exception e) {
      returnMoney(money);
      throw e;
    }
    return product;
  }

  private void returnMoney(int money) {
    this.money -= money;
  }

  private Product takeOutProduct(long productId) {
    return  products.remove(productId);
  }

  private void takeMoney(int money) {
    this.money += money;
  }
}
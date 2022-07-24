package com.dojinyou.allfordev.refactoring.refactoring3;

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
  public Product giveProduct(long productId) {
    return  products.remove(productId);
  }

  @Override
  public void takeMoney(int money) {
    this.money += money;
  }
}
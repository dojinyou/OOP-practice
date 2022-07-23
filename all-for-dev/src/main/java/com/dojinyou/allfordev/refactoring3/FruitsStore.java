package com.dojinyou.allfordev.refactoring3;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;

@Getter
public class FruitsStore extends Store {
  private int money = 0;
  private final String name = "과일마켓";
  private Map<Long, Product> products = new HashMap<>() {{
    put(1L, new Product(1L, "바나나", 30000));
    put(2L, new Product(2L, "사과", 50000));
  }};

  @Override
  public Product showProduct(long productId) {
    return null;
  }

  @Override
  public Product giveProduct(long productId) {
    return null;
  }

  @Override
  public void takeMoney(int money) {

  }
}
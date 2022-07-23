package com.dojinyou.allfordev.refactoring3;

import java.util.HashMap;
import java.util.Map;

public abstract class Store {
  private int money = 0;
  private String name = "";
  private Map<Long, Product> products = new HashMap<>();

  public abstract Product showProduct(long productId);
  public abstract Product giveProduct(long productId);
  public abstract void takeMoney(int money);
}


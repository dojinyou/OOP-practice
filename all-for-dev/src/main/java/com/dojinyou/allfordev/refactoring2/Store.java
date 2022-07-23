package com.dojinyou.allfordev.refactoring2;

import java.util.HashMap;
import java.util.Map;


public abstract class Store {
  private int money = 0;
  private String name = "";
  private Map<Long, Product> products = new HashMap<>();

  public abstract void setMoney(int money);
  public abstract void setProducts(Map<Long, Product> products);

  public abstract int getMoney();
  public abstract String getName();
  public abstract Map<Long, Product> getProducts();
}


package com.dojinyou.allfordev.refactoring.refactoring4;

import java.util.HashMap;
import java.util.Map;

public abstract class Store {
  private int money = 0;
  private String name = "";
  private Map<Long, Product> products = new HashMap<>();

  public abstract Product showProduct(long productId);

  public abstract Product sellProduct(long productId, int money);
}


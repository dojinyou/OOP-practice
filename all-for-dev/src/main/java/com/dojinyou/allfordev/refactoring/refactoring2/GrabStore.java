package com.dojinyou.allfordev.refactoring.refactoring2;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GrabStore extends Store {
  private int money = 0;
  private final String name = "dojin";
  private Map<Long, Product> products = new HashMap<>() {{
    put(1L, new Product(1L, "키보드", 30000));
    put(2L, new Product(2L, "모니터", 50000));
  }};
}
package com.dojinyou.allfordev.refactoring.refactoring2;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Product {
  private final long id;
  private final String name;
  private final int price;
}

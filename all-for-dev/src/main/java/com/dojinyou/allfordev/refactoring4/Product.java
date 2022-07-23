package com.dojinyou.allfordev.refactoring4;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Product {
  private final long id;
  private final String name;
  private final int price;
}

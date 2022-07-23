package com.dojinyou.allfordev.refactoring2;

public class Main {
  /*
    변경사항
    Todo:스토어가 다양해질 경우
      1. 스토어를 추상화한다.
      2. 스토어를 의존성 주입 받는다.
   */
  public static void main(String[] args) {
    User user1 = new User(new GrabStore());
    User user2 = new User(new FruitsStore());
    user1.setMoney(100_000);
    user1.purchaseProduct(1L);
  }
}

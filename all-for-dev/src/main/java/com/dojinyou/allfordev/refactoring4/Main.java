package com.dojinyou.allfordev.refactoring4;

import java.util.HashMap;

public class Main {
  /*
    변경사항
    1. 스토어가 다양해질 경우
      1. 스토어를 추상화한다.
      2. 스토어를 의존성 주입 받는다.
    2. Store의 상품과 돈에 마음대로 접근할 수 있다.
      1. Store의 책임을 정의하고 캡슐화 한다.
      2. User의 결제 로직을 수정한다.
      3. User도 캡슐화 한다.
    Todo: 3. User가 많은 행위를 책임지고 있다. Store가 판매하는 책임을 가질 수 있도록 한다.
      1. 상점에서 상품을 판매하는 행위를 추상화하고 구체적인 로직을 해당 메서드로 옮긴다.
   */
  public static void main(String[] args) {
    Store store = new GrabStore(
        new HashMap<>() {{
          put(1L, new Product(1L, "키보드", 30000));
          put(2L, new Product(2L, "모니터", 50000));
        }}
    );

    User user = new User(100_000, store);
    user.purchaseProduct(1L);
    System.out.println("user가 구매한 상품 :" + user.getBelongs());
  }
}

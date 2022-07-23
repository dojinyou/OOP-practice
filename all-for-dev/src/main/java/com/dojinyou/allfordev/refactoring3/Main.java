package com.dojinyou.allfordev.refactoring3;

import java.util.HashMap;
import java.util.Map;

public class Main {
  /*
    변경사항
    1. 스토어가 다양해질 경우
      1. 스토어를 추상화한다.
      2. 스토어를 의존성 주입 받는다.
    Todo: 2. Store의 상품과 돈에 마음대로 접근할 수 있다.
        1. Store의 책임을 정의하고 캡슐화 한다.
        2. User의 결제 로직을 수정한다.
        3. User도 캡슐화 한다.
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

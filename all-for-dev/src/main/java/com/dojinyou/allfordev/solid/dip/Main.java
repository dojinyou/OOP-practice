package com.dojinyou.allfordev.solid.dip;

public class Main {
  /*
    Dependency Inversion Principle(의존성 역전 원칙)
    의존성을 항상 고수준으로 향하게 하여 예측할 수 없는 의존성 변화를 줄이자는 원칙

    일반적으로 의존성을 가지는 대상은 의존하는 주체의 변경에 영향을 받게 된다.
    따라서 자주 변경될 가능성이 있는 저수준 구현체를 의존하게 된다면 코드 변경을 잦아진다.
    이로 인한 사이드 이펙트와 버그가 발생할 확률 역시 높아진다.
    고수준의 인터페이스나 추상클래스를 의존하고 있다면, 상대적으로 안전한 코드를 작성할 수 있다.

    이때, 고수준이란? 추상화되어 있거나 상위 수준의 개념을 의미한다.
    일반적으로 변화가 적고, 코드 레벨에서는 인터페이스나 추상클래스로 주로 구현된다.

    저수준은 추상화된 개념을 구체적으로 구현하는 개념이다.
   */
  public static void main(String[] args) {

  }
}

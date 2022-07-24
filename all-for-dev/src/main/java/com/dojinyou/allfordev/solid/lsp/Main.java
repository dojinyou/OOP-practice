package com.dojinyou.allfordev.solid.lsp;

public class Main {
  /*
    Liskov Substitution Principle
    부모 객체의 역할은 자식 객체도 할 수 있어야 한다.

    일반적으로 LSP를 위반하게 되면 OCP를 위반하게 된다.
   */
  public static void main(String[] args) {
    Square square = new Square(20);

    square.setWidth(20);
    square.setHeight(30);

    System.out.println(square.getWidth()+" "+square.getHeight());

  }
}

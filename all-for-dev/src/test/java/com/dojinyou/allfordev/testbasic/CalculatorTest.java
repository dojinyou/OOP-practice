package com.dojinyou.allfordev.testbasic;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

  private final Calculator calculator = new Calculator();

  @Test
  public void testAdd() {
    // given
    int a = 1;
    int b = 2;
    int expect = a + b;

    // when
    int result = calculator.add(a,b);

    // then
    assertThat(result).isEqualTo(expect);
  }

}
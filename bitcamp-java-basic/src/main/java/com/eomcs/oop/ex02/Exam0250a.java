package com.eomcs.oop.ex02;

public class Exam0250a {

  static class Calculator {
    int result = 0;

    static void plus(Calculator obj, int value) {
      obj.result += value;
    }

    static void minus(Calculator obj, int value) {
      obj.result -= value;
    }

    static void multiple(Calculator obj, int value) {
      obj.result *= value;
    }

    static void divide(Calculator obj, int value) {
      obj.result /= value;
    }
    static int abs(int a) {
      return a >= 0 ? a : a * -1;
    }
  }
  public static void main(String[] args) {
    Calculator c1 = new Calculator();
    Calculator c2 = new Calculator();

    Calculator.plus(c1, 2);
    Calculator.plus(c2, 3);

    Calculator.plus(c1, 3);
    Calculator.multiple(c2, 2);

    Calculator.minus(c1, 1);
    Calculator.plus(c2, 2);

    Calculator.multiple(c1, 7);
    Calculator.divide(c2, 4);

    Calculator.divide(c1, 3);
    Calculator.minus(c2, 5);

    System.out.printf("c1.result = %d\n", c1.result);
    System.out.printf("c2.result = %d\n", c2.result);
  }
}

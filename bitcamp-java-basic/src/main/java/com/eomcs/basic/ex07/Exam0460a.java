package com.eomcs.basic.ex07;

//# 메서드 : 스택 오버플로우 오류!
//
public class Exam0460a {

  static int sum(int value) {
    if (value == 1)
      return 1;

    return value + sum(value - 1);
  }

  public static void main(String[] args) {

    System.out.println(sum(100000));
  }
}

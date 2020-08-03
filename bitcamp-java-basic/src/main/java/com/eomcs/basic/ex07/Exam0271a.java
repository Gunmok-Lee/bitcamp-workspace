package com.eomcs.basic.ex07;

//# 메서드 : 가변 파라미터의 단점
//
public class Exam0271a {

  static void m2(int a, String... names) {}

  // 가변 파라미터에 비해 배열 파라미터는
  // 그 갯수와 형식이 자유롭다.
  static void x1(String[] names, String[] emails) {}
  // 여러 배열을 선언 가능하고.
  static void x2(String[] names, int a) {}
  // 배열을 먼저 선언후에 뒤에 단순한 변수 선언도 가능하다.
  public static void main(String[] args) {

  }
}

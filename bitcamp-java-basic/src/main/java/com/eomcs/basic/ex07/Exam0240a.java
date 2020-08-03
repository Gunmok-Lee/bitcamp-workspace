package com.eomcs.basic.ex07;

//# 메서드 : 개념 및 기본 문법 IV
//
public class Exam0240a {

  static String hello(String name, int age) {
    String retVal = String.format("%d살 %s님을 환영합니다!", age, name);
    return retVal;
  }
  public static void main(String[] args) {

    String r = hello("홍길동", 20);
    System.out.println(r);

    hello("임꺽정", 30);
    // 결과값만 받았지 출력하라는 명령이 없어서
    // 리턴값은 날아간다.
  }
}

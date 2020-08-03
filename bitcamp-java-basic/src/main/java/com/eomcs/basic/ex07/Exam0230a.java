package com.eomcs.basic.ex07;

//# 메서드 : 개념 및 기본 문법 III
//
public class Exam0230a {

  static String hello() {

    return "안녕하세요!";

    //메서드의 리턴후에는 작업 명령 수행 불가능!!
  }

  public static void main(String[] args) {

    String r = hello();
    System.out.println(r);

    hello();
  }
}

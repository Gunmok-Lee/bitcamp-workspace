package com.eomcs.basic.ex07;

//# 메서드 : main() 메서드 - 프로그램 아규먼트
//
public class Exam0520a {


  public static void main(String[] args) {

    for (String value : args) {
      System.out.printf("[%s]\n", value);
    }
    System.out.println("종료!");
  }
}

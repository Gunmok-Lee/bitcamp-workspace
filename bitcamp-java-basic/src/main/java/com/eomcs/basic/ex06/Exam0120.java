package com.eomcs.basic.ex06;


//흐름 제어문 - 조건문 if에 여러 문장을 묶
public class Exam0120 {
  public static void main(String[] args) {
    int age = 17;

    if (age >= 19)
      System.out.println("성인이다.");// 이 문장만 if에 소속된다.
      System.out.println("군대 가야한다.");
      System.out.println("일해야 한다.");
      System.out.println("세금 납부해야 한다.");

    System.out.println("--------------------------------");

    // 여러 문장을 if 문에 종속시키고 싶으면, 블록을 사용해라!
    if (age >= 19) {
      System.out.println("성인이다.");
      System.out.println("군대 가야한다.");
      System.out.println("일해야 한다.");
      System.out.println("세금 납부해야 한다.");
      // 이 모든 출력 문장이 if문에 소속된다.
    }
  }
}

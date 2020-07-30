package com.eomcs.basic.ex06;

// if else 문
public class Exam0140 {
  public static void main(String[] args) {
    int age = 17;

    if (age < 19)
      System.out.println("미성년입니다.");

    // else의 예시
    if (age >= 19)
      System.out.println("성인입니다.");
    // if문에 {} 괄호없이 사용하면 첫; 까지만 if문에 속성한다.
    // 따라서 한 조건에서 여러개의 문장 사용시
    // {} 을 사용하여 묶어야 한다.
    // 이는 else에서도 동일하다.
    // 묶지 않고 사용시 에러다
    else
      System.out.println("미성년입니다.");
  }
}

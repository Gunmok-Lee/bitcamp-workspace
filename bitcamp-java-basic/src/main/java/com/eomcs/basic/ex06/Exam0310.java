// 반복문: while (조건) 문장;
package com.eomcs.basic.ex06;

public class Exam0310 {
  public static void main(String[] args) {
    int count = 0;

    // 문법 1:
    // while (조건) 문장;
    // 조건이 참인동안 계속 실행.

    while (count < 5) System.out.println(count++);

    System.out.println("----------------------------");

    // 문법 2:
    // while (조건)
    // 문장;
    // 조건이 참인 동안 문장을 계속 실행한다.

    count = 0;
    while (count < 5)
      System.out.println(count++);

    System.out.println("------------------------------");

    // 문법 3:
    // while (조건)
    // 여러 개의 문장을 반복 실행하려면 블록으로 묶어라!
    count = 0;
    while (count < 5) {
      System.out.println(count);
      count++;
    }
  }
}

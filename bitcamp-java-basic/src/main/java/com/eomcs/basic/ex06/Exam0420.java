package com.eomcs.basic.ex06;

//for문의 초기화 변수
public class Exam0420 {
  public static void main(String[] args) {
    for (int i = 1; i <= 5; i++)
      System.out.println(i);
    // 반복문은 그안에서 선언된 변수의 값은
    // 해당 반복문을 벗어나면 사라진다.


    System.out.println("-------------------------");

    int x;
    for (x = 1; x <= 5; x++)
      System.out.println(x);
    System.out.printf("x = %d\n", x);
    // 따라서 반복문 종료 이후에도 변수를 사용하고 싶으면
    // 반복문 밖에서 변수를 선언해
  }
}

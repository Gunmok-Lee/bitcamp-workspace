package com.eomcs.basic.ex06;

//for 반복문
public class Exam0413 {
  public static void main(String[] args) {

    int i =1;
    for (;;) {
      if (i > 5)
        break;
      System.out.println(i);
      i++;
      // 변수선언과 조건 증감식을 모두 빼서 사용한 경우
      // (;;)를 사용하며 조건식은 if를 사용한다.
    }
  }
}

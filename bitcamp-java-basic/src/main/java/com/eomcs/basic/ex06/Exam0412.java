package com.eomcs.basic.ex06;

// for 반복문
public class Exam0412 {
  public static void main(String[] args) {

    int i = 1;
    for (; i<=5 ;) {
      System.out.println(i);
      i++;
      // 변수 선언을 보통 for문 안에서 하지만 빼서 사용하는 경우 해당자리에
      // ; 를 넣어주어야 한다.
    }
  }
}

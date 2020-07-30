package com.eomcs.basic.ex06;

// for 문 초기화 변수
public class Exam0421 {
  public static void main(String[] args) {

    //한 반복문 안에 여러개의 변수를 선언가능하다.
    for(int i = 1, j = 3; i <= 10; i++, j--) {
      System.out.printf("(%d,%d) ", i, j);
      System.out.println();
    }
  }
}

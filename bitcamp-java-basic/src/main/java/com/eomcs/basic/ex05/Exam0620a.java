package com.eomcs.basic.ex05;

//증감 연산자

public class Exam0620a {
  public static void main(String[] args) {
      int i = 7;
      
      i--;
      // 명령이 없으므로 우선 i = 7로 초기화 되었다가
      // -1이 실행되어 6으로 감소한다.
      
      System.out.println(i); // => 6
      
      System.out.println(i--); // => 6
      // 우선 i가 6이라는 명령이 실행된 후 출력하라는 명령이
      // 실행된다.
      // 따라서 출력은 6으로 나오지만 그후에 i값은
      // -1 이 되어 5가 된다
      System.out.println(i); // => 5
  }
}

package com.eomcs.basic.ex05;

//증감 연산자

public class Exam0630a {
  public static void main(String[] args) {
    int i = 7;
    
    int j = i++;
    // 해당 명령을 풀어보면
    // 우선 i에는 7이라는 값을 초기화 시켰고
    // 그값을 j의 초기화 값으로 가진다.
    // 그다음 i값에 +1이라는 명령이 실행되어
    // i는 8이라는 값을 가지게 된다.
    
    System.out.println(j); // => 7
    System.out.println(i); // => 8
  }
}

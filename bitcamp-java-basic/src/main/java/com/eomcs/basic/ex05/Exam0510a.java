package com.eomcs.basic.ex05;

//  조건연산자

public class Exam0510a {
  public static void main(String[] args) {
    //  조건 ? 표현식1 : 표현식2
    //  조건식이 참이면 표현식 1을 실행
    //  조건식이 거짓이면 표현식 2를 실행
    int age = 20;
    
    String message = (age > 18) ? "성년" : "미성년";
    System.out.printf("나이 %d는(은) %s이다.\n", age, message);
    
    // 표현식은 결과를 리턴하는 명령이어야 한다.
  }
}

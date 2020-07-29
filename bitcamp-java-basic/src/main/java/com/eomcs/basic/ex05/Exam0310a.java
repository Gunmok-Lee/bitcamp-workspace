package com.eomcs.basic.ex05;

public class Exam0310a {
  public static void main(String[] args) {
    // AND && 연산자
    // 두 개의 논리 값이 true일 때 결과 true
    System.out.println(true && true); // true 
    System.out.println(true && false); // false
    System.out.println(false && true); // false
    System.out.println(false && false); // true
    
    System.out.println("-------------------------");
    
    // OR || 연산자
    // 두 개의 논리 값 중 한 개라도 true면 결과는 true
    System.out.println(true || true); // true
    System.out.println(true || false); // true
    System.out.println(false || true); // true
    System.out.println(false || false); // false
    
    System.out.println("-------------------------");
    
    // NOT ! 연산자
    // true 와 false 값을 바꾼다.
    System.out.println(!true); // false
    System.out.println(!false); // true
    
    System.out.println("-------------------------");
    
    //exclusive-OR(XOR) ^ 연산자
    // - 배타적 비교 연산자라 부른다.
    // - 두 개의 값이 다를 때 true이다.
    // - 두 개의 값이 같으면 false이다.
    System.out.println(true ^ true); // false
    System.out.println(false ^ false); // false
    System.out.println(true ^ false); // true
  }
}

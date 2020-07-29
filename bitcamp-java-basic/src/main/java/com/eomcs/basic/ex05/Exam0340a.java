package com.eomcs.basic.ex05;

// || 과 | 의 차이
public class Exam0340a {
  public static void main(String[] args) {
    boolean a = true;
    boolean b = false;
    boolean r = a || (b = true);
    
    // ||는 두개의 논리값중 하나라도 true면 true를 실행한다.
    // || 도 &&과 마찬가지로 앞에서 a가 true로 결과 값이 
    // true가 되었기 때문에 뒤에 (b = true)를 실행하지 않는다.
    System.out.printf("a=%b, b=%b, r=%b\n", a, b, r);
    
    a = true;
    b = false;
    r = a | (b = true);
    
    // 그러나 | 에서는 이미 a가 true 여서 r의 결과값이
    // true로 지정되었어도 뒤에 수행문까지 실행한다.
    // 따라서 b는 true로 다시 초기화 된다.
    System.out.printf("a=%b, b=%b, r=%b\n", a, b, r);
  }
}

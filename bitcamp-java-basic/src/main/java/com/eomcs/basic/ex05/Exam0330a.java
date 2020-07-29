package com.eomcs.basic.ex05;

// &&과 & 의 차이
public class Exam0330a {
  public static void main(String[] args) {
    boolean a = false;
    boolean b = false;
    boolean r = a && (b = true);
    // 계산 순서
    // r = a && (b = true)
    System.out.printf("a=%b, b=%b, r=%b\n", a, b, r);
    
    a = false; // 위에서 a의 데이터타입이 boolean이라 
               // 선언했기 때문에 초기화만 시
    b = false;
    r = a & (b = true);
    
    System.out.printf("a=%b, b=%b, r=%b\n", a, b, r);
    
    // 위의 출력값에서는 && 연산을 사용하여 이미 a가 false라는
    // 값에 의해 (b = true)는 실행되지 않고 넘어간다.
    // 그러나 밑의 &에서는 우선 a가 false라는 값을 가져도
    // 해당 행의 (b = true)를 실행하고 밖으로 나가기 때문에
    // b 가 true로 초기화 된다.
  }
}

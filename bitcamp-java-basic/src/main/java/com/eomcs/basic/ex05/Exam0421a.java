package com.eomcs.basic.ex05;

public class Exam0421a {
  public static void main(String[] args) {
    
    int i = -87;
    
    System.out.println(i);
    
    System.out.println(i >> 1);
    
    System.out.println(i >> 2);
    
    //  음수에 대해서도 2**n으로 나눈 것과 같다
    //  다만 소수점 자리에 대해서는 더 낮은 정수값으로 결과가 난다.
    //  빈자리 전체가 부호에 맞는 비트로 채워진다.
  }
}

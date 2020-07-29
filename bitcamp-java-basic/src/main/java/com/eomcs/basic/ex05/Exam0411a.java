package com.eomcs.basic.ex05;

// 비트 이동 연산자
public class Exam0411a {
  public static void main(String[] args) {
    int a = 10101000_00000000_00000000_00011010;
    System.out.println(a << 1); 
    System.out.println(a << 2);
    System.out.println(a << 3);
    System.out.println(a << 4);
  }
}

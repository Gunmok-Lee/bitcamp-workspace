package com.eomcs.basic.ex05;

//# 증감 연산자 : 전위(pre-fix) 증감 연산자 응용 II
//
public class Exam0681a {
  public static void main(String[] args) {
    int a = 5;
    int r = --a + --a / --a;
    
    System.out.println(r);
  }
}

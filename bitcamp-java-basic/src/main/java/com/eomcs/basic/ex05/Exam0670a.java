package com.eomcs.basic.ex05;

//# 증감 연산자 : 전위(pre-fix) 증감 연산자 응용 I
//
public class Exam0670a {
  public static void main(String[] args) {
    int a = 5;
    int r = ++a;
    
    // 간단하게 연산후 바로 할당한다
    // 따라서 r은 6이 된다
    
    System.out.println(r);
  }
}

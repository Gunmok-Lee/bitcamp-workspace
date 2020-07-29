package com.eomcs.basic.ex05;

//# 증감 연산자 : 전위(pre-fix) 증감 연산자 응용 II
//
public class Exam0680a {
  public static void main(String[] args) {
    int i = 2;
    int result = ++i + ++i * ++i;
    // 간단하게 업하고 실행
    System.out.println(result);
  }
}

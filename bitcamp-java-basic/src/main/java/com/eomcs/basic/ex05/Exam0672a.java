package com.eomcs.basic.ex05;

//# 증감 연산자 : 전위(pre-fix) 증감 연산자 응용 I
//
public class Exam0672a {
  public static void main(String[] args) {
    int i = 2;
    i = ++i;
    
    System.out.println(i);
    // 후위 연산자랑 다르게 우선 값이 i = 3 으로 놓인다.
    // 다음 i + 1을 해 i = 3 이 실행되고 할당은 i = 3으로 들어간다
    // 두번의 계산이 같으므로 의미가 없다.
  }
}

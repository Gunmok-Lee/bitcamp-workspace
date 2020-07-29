package com.eomcs.basic.ex05;

//# 증감 연산자 : 후위(post-fix) 증감 연산자 응용 I
//
public class Exam0631a {
  public static void main(String[] args) {
    int i = 7;
    
    i = i++;
    // 다음식을 실행하면 우선
    // i = 7이라는 값이 놓인다.
    // 그후에 i = i + 1이 실행되어 i = 8이라는 값이 나오지만
    // 그전에 할당식에 의하여 i = 7이라는 초기화 값이 설정되고
    // i는 7의 값을 유지한다.
    // 만약 다른 변수였다면 i = 8의 값이 초기화 되었겠지만.
    // 이미 이전에 실행한 i = 7이라는 초기화가 적용되기 때문에
    // 8이 될 수 없다.
    System.out.println(i);
  }
}

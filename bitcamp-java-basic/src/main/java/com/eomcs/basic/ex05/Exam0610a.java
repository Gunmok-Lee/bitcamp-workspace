package com.eomcs.basic.ex05;


//증감 연산자
public class Exam0610a {
  public static void main(String[] args) {
    int i = 2;
    
    // i++ 변수 뒤에 붙은 증감 연산자는 우선
    // i의 값을 꺼내 놓은뒤 명령을 실행 후에 증감을 실행한다.
    // 그래서 예를 들어 i = 2로 초기화한 상태에서
    // i++를 출력한다면 우선 출력되는 값은 2가 나오고
    // 그 다음 i가 3으로 초기화된다.
    
    System.out.println(i++); // => 2
    // 출력은 2가 나왔지만 명령 실행 후 i가 3이 되었으므로
    // 다시 i를 출력해보면 3이 나온다.
    System.out.println(i); // => 3
  }
}

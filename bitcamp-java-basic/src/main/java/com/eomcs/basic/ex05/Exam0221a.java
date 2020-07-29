// 부동소수점 비교
package com.eomcs.basic.ex05;

public class Exam0221a {
  public static void main(String[] args) {
    float f1 = 0.1f;
    float f2 = 0.1f;
    
    System.out.println(f1 * f2 == 0.01f); 
    // 부동소수점의 산술연산으로 쓰레기 값이 발생
    // 처리결과가 false 가 나온다.
    // 해결하기 위해 오차를 제거하고 그 값이 오차 이하의 값인지 비교한다.
    
    float r = f1 * f2 - 0.01f;
    System.out.println(Math.abs(r) <= Float.POSITIVE_INFINITY);
    //Math.abs는 절대값을 의미하고 POSITIVE_INFINITY는 java에서 지정한 오차값을 말한다.
    
  }
}

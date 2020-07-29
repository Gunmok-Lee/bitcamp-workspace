package com.eomcs.basic.ex05;

// & 대신 %을 활용하기     
public class Exam0351a {
  public static void main(String[] args) {
    
    System.out.println(57 % 2);
    System.out.println(57 & 0b00000001);
    
    // 정수는 사실상 비트에 메모리가 입력되고
    // 비트에 저장된 메모리는 0과 1로 2진법으로 볼때
    // 나머지를 구하는 것은 해당하는 숫자의 2진법과 &을
    // 사용이 가능하다.
    
    // 단 그 수는 2의 제곱수 여야만 한다.
  }
}

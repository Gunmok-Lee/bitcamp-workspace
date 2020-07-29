package com.eomcs.basic.ex05;

//# 비트 이동 연산자 
//
public class Exam0460a {
  public static void main(String[] args) {
    final int CSS         = 0x01; // 0000 0001
    final int HTML        = 0x02; // 0000 0010
    final int PHP         = 0x04; // 0000 0100
    final int PYTHON      = 0x08; // 0000 1000
    final int JAVASCRIPT  = 0x10; // 0001 0000
    final int JAVA        = 0x20; // 0010 0000
    final int CPP         = 0x40; // 0100 0000
    final int C           = 0x80; // 1000 0000
    
    // Java와 C, C++, JavaScript를 할 줄 아는 개발자의 정보를 설정하시오
    int lang = C | JAVA | PYTHON | HTML;
    //   1000 0000
    // | 0010 0000
    // | 0000 1000
    // | 0000 0010
    // ------------
    //   1010 1010
    
    System.out.println(Integer.toBinaryString(lang));
    
  }
}

package com.eomcs.basic.ex05;

// & 활용하여 색상 제거 하기
public class Exam0354a {
  public static void main(String[] args) {
    int pixel = 0x003f4478; // 각 바이트의 값이 '00RRGGBB' 라고 가정시
    System.out.println(pixel & 0x0000ffff);
    // pixel = 00000000_00111111_01000100_01111000
    //       & 00000000_00000000_11111111_11111111
    //      ---------------------------------------
    //         00000000_00000000_01000100_01111000
    //   즉 원하는 1의값은 살리고 0은 false값으로 죽인다.
    //   따라서 RR(RED)의 값이 제거 된 것을 볼 수 있다.
    
  }
}

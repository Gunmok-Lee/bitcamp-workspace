package com.eomcs.basic.ex05;

// & 연산자를 이용하여 비트 특정 부분의 값만 추출이 가능하다.
public class Exam0353a {
  public static void main(String[] args) {
    int data = 0b1111_1001_0111_1111;
    System.out.println(Integer.toBinaryString(data & 0b0000_1111_1100_0000));
    //  1111_1001_0111_1111
    // & 0000_1111_1100_0000
    //-----------------------
    //   0000_1001_0100_0000
    // 원하는 부분은 1로 두면 그자리에 1이면 1이 출력될것이고
    // 0인부분은 false임으로 어차피 0이 나타날 것이다.
    // 고로 원하는 자리의 숫자만 알아낼 수 있다.
  }
}

package com.eomcs.basic.ex05;

// 비트 이동 연산자
public class Exam0410a {
  public static void main(String[] args) {
    int i = 1;
    // 00000000 00000000 00000000 00000001
    System.out.println(i << 1);
    // 왼쪽에 1비트 0을 지우고 오른쪽에 0을 채운다.
    // 0000000 00000000 00000000 00000001 0 = 2
    
    System.out.println(i << 2);
    // 왼쪽에 3비트 0을 2개 지우고 오른쪽에 채운다.
    // 000000 00000000 00000000 00000001 00 = 4
    
    System.out.println(i << 3);
    // 왼쪽에 3비트 0을 3개 지우고 오른쪽에 채운다.
    // 00000 00000000 00000000 00000001 000 = 8
    
    System.out.println(i << 4);
    // 왼쪽에 3비트 0을 4개 지우고 오른쪽에 채운다.
    // 0000 00000000 00000000 00000001 0000 = 16
    // 자세히 보면 << 왼쪽으로 비트를 이동하는 연산자는
    // n번 움직일 때 마다 2씩 곱해진다.
    // 따라서 2의 n승을 곱하면 값이 나온다.
    
    //EX)
    i = 11; // 00000000 000000000 00000000 00001011
    System.out.println(i << 1); // i * 2**1 = 22
    System.out.println(i << 2); // i * 2**2 = 44
    System.out.println(i << 3); // i * 2**3 = 88
    System.out.println(i << 26);
    System.out.println(i << 27);
    System.out.println(i << 28);
    System.out.println(i << 29);
    System.out.println(i << 33);
    System.out.println(i << 34);
  }
}

package com.eomcs.corelib.ex02;

public class Exam0170a {
  public static void main(String[] args) {

    String s1 = String.format("%s님의 나이는 %d입니다", "홍길동", 20);
    System.out.println(s1);

    String s2 = String.valueOf(true); // true => "true"
    String s3 = String.valueOf(100); // 100 => "100"
    String s4 = String.valueOf(100L); // 100L => "100"
    String s5 = String.valueOf(3.14f); // 3.14f => "3.14"
    String s6 = String.valueOf(3.14); // 3.14 => "3.14"
    String s7 = String.valueOf('가'); // '가' => "가"

    System.out.println(s2);
    System.out.println(s3);
    System.out.println(s4);
    System.out.println(s5);
    System.out.println(s6);
    System.out.println(s7);
  }
}
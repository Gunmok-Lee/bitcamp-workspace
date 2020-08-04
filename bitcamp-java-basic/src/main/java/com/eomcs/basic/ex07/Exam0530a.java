package com.eomcs.basic.ex07;

//# 메서드 : main() 메서드 - 프로그램 아규먼트 응용 I
//
public class Exam0530a {

  public static void main(String[] args) {

    int sum = 0;
    for (String arg : args)
      sum += Integer.parseInt(arg);
    System.out.printf("합계: %d\n", sum);
  }
}

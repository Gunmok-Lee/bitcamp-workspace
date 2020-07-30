package com.eomcs.basic.ex06;


import java.util.Scanner;

// if else문 2
public class Exam0161 {
  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    System.out.println("나이를 입력하세요?");
    int age = keyScan.nextInt();

    if (age < 8)
      System.out.println("아동입니다.");
    else
      if (age < 14)
        System.out.println("어린이입니다.");
      else
        if(age < 19)
          System.out.println("청소년입니다.");
        else
          if (age < 65)
            System.out.println("성인입니다.");
          else
            System.out.println("노인입니다.");

    // Exam0160 과 비교해보면 {}가 없다.
    // 이처럼 if else문과 한개의 ; 문장이 실행될시에는
    // {}을 안쳐도 되나 국제적으로 google 표기법에 의해
    // 한 문장에 한번{}가 권고 된다.




    keyScan.close();
  }
}


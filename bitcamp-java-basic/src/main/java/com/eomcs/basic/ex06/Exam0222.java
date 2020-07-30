package com.eomcs.basic.ex06;

import java.util.Scanner;

// switch 사용 후
public class Exam0222 {
  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    System.out.println("[지원부서]");
    System.out.println("1. S/W개발");
    System.out.println("2. 일반관리");
    System.out.println("3. 시설경비");
    System.out.println("지원 분야의 번호를 입력하세요? ");
    int no = keyScan.nextInt();

    System.out.println("제출하실 서류는 다음과 같습니다.");
    switch (no) {
      case 1 :
        System.out.println("정보처리자격증");
      case 2:
        System.out.println("졸업증명서");
      case 3:
        System.out.println("이력서");
        break;
        default:
          System.out.println("올바른 번호를 입력하세요!");
          // 브레이크 문이 없을시 해당 된 case부터
          // break; 가 나올때까지 계속 실행된다.
          // 따라서 공통의 정보를 가질때는
          // break; 를 생략하여 코드를 줄일 수 있다.
    }
    keyScan.close();
  }
}

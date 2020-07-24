package com.eomcs.pms;

public class App3 {

  public static void main(String[] args) {
    java.util.Scanner keyInput = new java.util.Scanner(System.in);
    
    System.out.println("[작업]");
    
    System.out.print("프로젝트? ");
    String project = keyInput.nextLine();
    
    System.out.print("번호? ");
    String str = keyInput.nextLine();
    int no = Integer.parseInt(str);
    // 문자열을 인트로 바꾸는 작업도 가능
    // 단 바꿀 수 없는 문자열의 경우 에러뜸
    
    
    System.out.print("내용? "); 
    String content = keyInput.nextLine();
    
    System.out.print("완료일? ");
    java.sql.Date completedDate = java.sql.Date.valueOf(keyInput.nextLine());
    
    System.out.print("상태? \n");
    System.out.print("0: 신규\n");
    System.out.print("1: 진행중\n");
    System.out.print("2: 완료\n");
    System.out.print("> ");
    String state = keyInput.nextLine();
    
    System.out.print("담당자? ");
    String worker = keyInput.nextLine();
    
    
    keyInput.close();
    System.out.println("------------------------------");
    System.out.printf("프로젝트명: %s\n", project);
    System.out.printf("번호: %d\n", no);
    System.out.printf("내용: %s\n", content);
    System.out.printf("완료일: %s\n", completedDate.toString());
    System.out.print("상태: ");
//    if (state.equals("0")) { 
//    //문자열은 == 연산자로 비교 불가능하여 .equals()사용
//      System.out.println("신규");
//    } else if (state.equals("1")) {
//      System.out.println("진행중");
//    } else {
//      System.out.println("완료");
//    }
//    System.out.printf("담당자: %s\n", worker);
//    if 문법
    
    switch (state) {
      case "0":
        System.out.println("신규");
        break;
      case "1":
        System.out.println("진행중");
        break;
      default:
        System.out.println("완료");
    }
    System.out.printf("담당자: %s\n", worker);
  }
}

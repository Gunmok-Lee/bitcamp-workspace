package com.eomcs.pms;

import java.util.Scanner;
import java.sql.Date;
public class App3 {

  public static void main(String[] args) {
    Scanner keyInput = new Scanner(System.in);
    
    String project;
    
    System.out.println("[작업]");
    System.out.print("프로젝트? ");
    project = keyInput.nextLine();
    
    final int MAX_LENGTH = 5;
    int[] no = new int[MAX_LENGTH];
    String[] content = new String[MAX_LENGTH];
    Date[] completedDate = new Date[MAX_LENGTH];
    String[] state = new String[MAX_LENGTH];
    String[] worker = new String[MAX_LENGTH];
    
    int count = 0;
    
    for (int i = 0; i < MAX_LENGTH; i++) {
      
      
      System.out.print("번호? ");
      String str = keyInput.nextLine();
      no[i] = Integer.parseInt(str);
      
      System.out.print("내용? "); 
      content[i] = keyInput.nextLine();
      
      System.out.print("완료일? ");
      completedDate[i] = Date.valueOf(keyInput.nextLine());
      
      System.out.print("상태? \n");
      System.out.print("0: 신규\n");
      System.out.print("1: 진행중\n");
      System.out.print("2: 완료\n");
      System.out.print("> ");
      state[i] = keyInput.nextLine();
      
      System.out.print("담당자? ");
      worker[i] = keyInput.nextLine();
      System.out.println();
      
      System.out.println("계속 입력하시겠습니다?(y/N) ");
      String response = keyInput.nextLine();
      
      
      if (response.equalsIgnoreCase("y") == false) {
        break; // 반복문을 멈춰라.
      }
    }
        
      keyInput.close();
      System.out.println("------------------------------");
      System.out.print(project);
      for (int i = 0; i < count; i++) {
        System.out.printf("%d, %s, %s, %s, %s ", no[i], content[i], completedDate[i].toString(), state[i], worker[i]);
      
      switch (state[i]) {
        case "0":
          System.out.println("신규");
          break;
        case "1":
          System.out.println("진행중");
          break;
        default:
          System.out.println("완료");
    }
    
    }
    //1, 작업1, 2020-01-10, 신규, 홍길동
  }
}

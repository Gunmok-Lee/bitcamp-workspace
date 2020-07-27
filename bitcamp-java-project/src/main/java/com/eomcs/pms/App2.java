package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;
public class App2 {

  public static void main(String[] args) {
    Scanner keyInput = new Scanner(System.in);
    
    System.out.println("[프로젝트]");
    
    final int MAX_LENGHT = 5;
    int[] no = new int[MAX_LENGHT];
    String[] title = new String[MAX_LENGHT];
    String[] content = new String[MAX_LENGHT];
    Date[] startDate = new Date[MAX_LENGHT];
    Date[] endDate = new Date[MAX_LENGHT];
    String[] owner = new String[MAX_LENGHT];
    String[] members = new String[MAX_LENGHT];
    
    int count = 0;
    
    for (int i = 0; i < MAX_LENGHT; i++) {
      count++;
      System.out.print("번호? ");
      no[i] = keyInput.nextInt();
      keyInput.nextLine();
      
      System.out.print("프로젝명? ");
      title[i] = keyInput.nextLine();
      
      System.out.print("내용? "); 
      content[i] = keyInput.nextLine();
      
      System.out.print("시작일? ");
      startDate[i] = Date.valueOf(keyInput.nextLine());
      //valueOf를 통해 년 월 일 형식의 날짜를 입력받는다.
      //그게 아닐경우 에러가 뜬다.
      
      System.out.print("종료일? ");
      endDate[i] = Date.valueOf(keyInput.nextLine());
      
      System.out.print("만든이? ");
      owner[i] = keyInput.nextLine();
      
      System.out.print("팀원? ");
      members[i] = keyInput.nextLine();
      System.out.println();
      
      System.out.println("계속 입력하시겠습니다?(y/N) ");
      String response = keyInput.nextLine();
      
      if (response.equalsIgnoreCase("y") == false) {
        break; // 반복문을 멈춰라.
      }
    }
    
    keyInput.close();
    System.out.println("------------------------------");
    
    for (int i = 0; i < count; i++) {
      System.out.printf("%d, %s, %s, %s, %s\n", no[i], title[i], startDate[i].toString(), endDate[i].toString(), owner[i]);
    }
  }
}

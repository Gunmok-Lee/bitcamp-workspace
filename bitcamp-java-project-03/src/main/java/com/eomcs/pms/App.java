package com.eomcs.pms;

public class App {

  public static void main(String[] args) {
    
    // 콘솔에서 사용자의 입력을 처리하는 도구를 준비한다.
    // => 키보드 input stream: System.in
    // => input stream에서 data를 읽어 적절한 타입으로 리턴하는 도구: Scanner
    java.util.Scanner keyInput = new java.util.Scanner(System.in);
    // 왼쪽의 keyInput 이라는 스캐너 도구의 이름을 설정
    
    System.out.println("[회원]");
    System.out.print("번호? ");
    int no = keyInput.nextInt();
    //nextLine은 문자열 nextInt는 인트값을 입력받는다.
    //키인풋 입력받은것은 넘버라는 곳에 리턴한다.
    keyInput.nextLine(); //nextInt()는 입력 값 중에서 숫자만 뽑아간다.
    // 넥스트 라인으로 넥스트 인트에서 사용하고 남아 있는 숫자 뒤에 CR/LF 값을
    // 읽은 뒤에 값을 날려버리기
    
    System.out.print("이름? ");
    String name = keyInput.nextLine();
    
    System.out.print("이메일? ");
    String email = keyInput.nextLine();
    
    System.out.print("암호? ");
    String password = keyInput.nextLine();
    
    System.out.print("사진? ");
    String photo = keyInput.nextLine();
    
    System.out.print("전화? ");
    String tel = keyInput.nextLine();
    
    
    long currentTimeMillis = System.currentTimeMillis();
    // 1970-1-1 00:00:00 에서 경과된 밀리초
    java.sql.Date now = new java.sql.Date(currentTimeMillis);
    // java.sql에 Date 라는 시간을 년 월 일로 표시하는 도구
    // now 라는 리모콘을 이용하여 사용
    
    
    
    
    
    keyInput.close();
    // 도구를 사용했으면 닫아야 한다.(모든 도구가 그런것은 아님)
    
    System.out.println("----------------------------");
    System.out.printf("번호: %d\n", no);
    //받은 문자열을 출력한다.
    System.out.printf("이름: %s\n", name);
    System.out.printf("이메일: %s\n", email);
    System.out.printf("암호: %s\n", password);
    System.out.printf("사진: %s\n", photo);
    System.out.printf("전화: %s\n", tel);
    System.out.printf("가입일: %s\n", now.toString());

  }
}

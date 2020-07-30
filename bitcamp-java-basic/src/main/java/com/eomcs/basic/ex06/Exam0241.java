package com.eomcs.basic.ex06;

//switch 문법 II
public class Exam0241 {
  public static void main(String[] args) {
    int level = 1;

    // 상수를 사용하여 case 사용하기
    final int GUEST = 0, MEMBER = 1, ADMIN = 2;

    switch (level) {
      case GUEST:
        System.out.println("조회만 가능합니다.");
        break;
      case MEMBER:
        System.out.println("글작성 가능합니다.");
        break;
      case ADMIN:
        System.out.println("다른 회원의 글을 변경, 삭제할 수 있습니다.");
        break;
        // 이처럼 만약 게스트, 멤버, 어드민의 데이터 타입이 상수가 아닌
        // 일반 int 타입이였다면 케이스에는 0, 1, 2의 값으로 사용했어야한다.
        // 하지만 그렇게 하면 다른 개발자가 보았을때 가독성이 없고
        // 주석으로 설명하지 않으면 이해하기가 어렵다.
        // 따라서 상수 설정으로 그 불편함을 제거해준다.
    }
  }
}

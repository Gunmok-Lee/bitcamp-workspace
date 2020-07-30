package com.eomcs.basic.ex06;

// switch 문법 II
public class Exam0242 {

enum Level{
  GUEST, MEMBER, ADMIN
}
// enum을 사용하여 상수를 조금더 조직적으로 사용한다.
// 사용할 상수들을 enum에 저장하는데 그 그룹이름을 Level이라 하자
  public static void main(String[] args) {

    Level level = Level.MEMBER;
    // 그룹명의 데이터에서 level이라는 선언을 하고
    // 그것은 그룹에 상수인 MEMBER라고 초기를한다.
    switch (level) { //레벨이라는 상수를 케이스에 넣는다
      case GUEST:
        System.out.println("조회만 가능합니다.");
        break;
      case MEMBER:
        System.out.println("글 작성 가능합니다.");
        break;
      case ADMIN:
        System.out.println("다른 회원의 글을 변경, 삭제 가능합니다.");
        break;
    }
  }
}

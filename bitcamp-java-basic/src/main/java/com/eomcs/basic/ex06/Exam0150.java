package com.eomcs.basic.ex06;

//else문의 소속
public class Exam0150 {
  public static void main(String[] args) {
    int age = 25;

    if (age >= 19) {
      if (age >= 70)
        System.out.println("지하철 무임승차 대상입니다.");
    else
        System.out.println("미성년입니다.");
  }
    System.out.println("------------------------------");
    // 분명히 문장의 흐름을 보면 나이 25세는 성인이지만
    // 70세 이상은 아니라 아무값도 출력이 되면 안된다.
    // 그러나 {} 사용없이 else문은 가장 가까운 if 문에 귀속된다.
    // 따라서 미성년입니다는 처음 19세 이상에 소속이 아니라
    // age >= 70의 else로 소속되어 25세를 입력해도
    // 미성년이라고 출력이 된다.

    age = 60;

    if (age >= 19) {
      if (age >= 70)
        System.out.println("지하철 무임승차 대상입니다.");
      else
        System.out.println("승차권을 지불하세요");
    }
    else
        System.out.println("미성년입니다.");
  }
}

package com.eomcs.oop.ex03;

public class Exam0210a {
  static class A {
    static void m1() {
      System.out.println("m1()");
    }
    void m2() {
      System.out.println("m2()");
    }

    public static void main(String[] args) {
      A.m1();
      //A.m2(); 오류 인스턴스 메서드는 클래스 이름으로 호출할 수 없고
      // new를 통해 레퍼런스를 선언후에 호출 가능

      A obj1 = new A();

      obj1.m1();
      // 이것은 컴파일러가 A.m1();으로 호출하는 것과 같다.
      // 스태틱 메서드이기 때문이다.

      obj1.m2();

      A obj2 = null;
      obj2.m2();
      // 컴파일은 가능하나 실제로 레퍼런스 주소값에 아무것도 들어가지 않기에
      // 실행 불가
    }
  }
}

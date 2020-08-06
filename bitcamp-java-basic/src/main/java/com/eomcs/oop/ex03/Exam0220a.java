package com.eomcs.oop.ex03;

public class Exam0220a {
  static class A {
    int value;

    static void m1() {
    // 스태틱 메서드로 인스턴스 변수값 value 접근 불가
    }
    void m2() {
      this.value = 100;
    }
    void m3() {
      value = 200; // this가 자동 생략
    }
    void m4(int value) {
      value = 200;

      this.value = 300;
      System.out.println(this.value);
      // 로컬변수와 인스턴스 이름이 같으면
      // this를 붙이지 않으면 로컬변수로 인식
    }
  }
  public static void main(String[] args) {
    A.m1();
    A obj1 = new A();
    obj1.m2();

    obj1.m1();

    A obj2 = new A();

    obj2.m2();
    obj2.m4(100);
  }
}

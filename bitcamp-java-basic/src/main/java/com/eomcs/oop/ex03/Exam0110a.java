package com.eomcs.oop.ex03;

public class Exam0110a {
  public static void main(String[] args) {
    class A {
    int v1;
    boolean v2; // 인스턴스 변수로 설계도일 뿐이지 new를 통해 인스턴스 생성전에는 의미없음

    }

    A obj1 = new A();  // 만들어진 인스턴스 는 객체이고
    A obj2 = new A();  // 인스턴스를 가리키는 obj1,2,3은 레퍼런스이다.
    A obj3 = new A();  // 인스턴스 안에 변수를 인스턴스 변수이다.

    obj1.v1 = 100;
    obj2.v1 = 200;
    obj3.v1 = 300;


    System.out.printf("%d, %d, %d\n", obj1.v1, obj2.v1, obj3.v1);

  }
}

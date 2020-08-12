// 오버라이딩(overriding) - 준비
package com.eomcs.oop.ex06.c;

public class Exam0110 {
  public static void main(String[] args) {
    A obj1 = new A();
    obj1.name = "홍길동";

    obj1.print();
System.out.println("--------------------");
    A3 a3 = new A3();
    a3.print();
    System.out.println(a3.tel);
  }
}

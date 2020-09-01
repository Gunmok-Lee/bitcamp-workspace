package com.eomcs.generic.ex01;

import java.util.ArrayList;

public class Exam0220a {

  static class A {}
  static class B1 extends A {}
  static class B2 extends A {}
  static class C extends B1 {}

  public static void main(String[] args) {
    m1(new ArrayList<B1>());

    System.out.println("실행완료");

  }

  static void m1(ArrayList list) {
    list.add(new Object());
    list.add(new A());
    list.add(new B1());
    list.add(new B2());
    list.add(new C());

  }
}

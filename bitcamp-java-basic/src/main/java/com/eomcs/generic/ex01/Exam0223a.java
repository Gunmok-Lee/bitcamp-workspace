package com.eomcs.generic.ex01;

import java.util.ArrayList;

public class Exam0223a {

  static class A {}
  static class B1 extends A {}
  static class B2 extends A {}
  static class C extends B1 {}


  public static void main(String[] args) {


    m1(new ArrayList());
    m1(new ArrayList<B1>());
  }

  static void m1(ArrayList<B1> list) {
    list.add(new B1());

    list.add(new C());
  }
}

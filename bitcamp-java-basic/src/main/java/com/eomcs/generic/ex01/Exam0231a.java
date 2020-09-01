package com.eomcs.generic.ex01;

import java.util.ArrayList;

public class Exam0231a {

  static class A {}
  static class B1 extends A {}
  static class B2 extends A {}
  static class C extends B1 {}


  public static void main(String[] args) {

    ArrayList<B1> list1 = new ArrayList<>();

    list1.add(new B1());
    list1.add(new C());
  }
}

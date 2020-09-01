package com.eomcs.generic.ex01;

import java.util.ArrayList;

public class Exam0221a {

  static class A {}
  static class B1 extends A {}
  static class B2 extends A {}
  static class C extends B1 {}


  public static void main(String[] args) {
    m1(new ArrayList());
    m1(new ArrayList<Object>());
  }


  static void m1(ArrayList<Object> list) {

  }
}

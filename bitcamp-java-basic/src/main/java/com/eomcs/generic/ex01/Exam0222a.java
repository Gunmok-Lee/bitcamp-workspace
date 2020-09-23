package com.eomcs.generic.ex01;

import java.util.ArrayList;

public class Exam0222a {

  static class A {}
  static class B1 extends A {}
  static class B2 extends A {}
  static class C extends B1 {}


  public static void main(String[] args) {

    m1(new ArrayList());
    m1(new ArrayList<Object>());
    m1(new ArrayList<A>());
    m1(new ArrayList<B1>());
    m1(new ArrayList<B2>());
    m1(new ArrayList<C>());
  }

  static void m1(ArrayList<?> list) {

  }
}
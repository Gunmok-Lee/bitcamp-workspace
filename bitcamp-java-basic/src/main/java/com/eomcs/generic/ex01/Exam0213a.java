package com.eomcs.generic.ex01;

import java.util.ArrayList;

public class Exam0213a {


  static class A {}
  static class B1 extends A {}
  static class B2 extends A {}
  static class C extends B1 {}

  public static void main(String[] args) {
    ArrayList<A> list1;

    list1 = new ArrayList();
    list1 = new ArrayList<>();
    list1 = new ArrayList<A>();

    ArrayList<B1> list2;
    list2 = new ArrayList();
    list2 = new ArrayList<>();
    list2 = new ArrayList<B1>();

  }
}

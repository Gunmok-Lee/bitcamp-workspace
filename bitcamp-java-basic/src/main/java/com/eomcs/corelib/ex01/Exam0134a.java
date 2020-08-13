package com.eomcs.corelib.ex01;

public class Exam0134a {
  public static void main(String[] args) {

    String s1 = new String("hello");
    String s2 = new String("hello");

    System.out.println(s1 == s2);
    System.out.println(s1.equals(s2));

    StringBuffer sb1 = new StringBuffer("hello");
    StringBuffer sb2 = new StringBuffer("hello");

    System.out.println(sb1 == sb2);
    System.out.println(sb1);

  }
}

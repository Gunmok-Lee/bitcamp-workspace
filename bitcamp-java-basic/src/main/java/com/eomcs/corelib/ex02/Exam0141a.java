package com.eomcs.corelib.ex02;

public class Exam0141a {
  public static void main(String[] args) {

    Object obj = new String("Hello");

    String x1 = (String) obj;

    String x2 = obj.toString();

    System.out.println(x1 == x2);

    System.out.println(obj);

  }
}

package com.eomcs.corelib.ex02;

public class Exam0161a {
  public static void main(String[] args) {


    StringBuffer buf = new StringBuffer("Hello");
    System.out.println(buf);

    buf.replace(2, 4, "x");
    System.out.println(buf);
  }
}

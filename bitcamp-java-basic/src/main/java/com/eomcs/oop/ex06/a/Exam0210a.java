package com.eomcs.oop.ex06.a;

public class Exam0210a {

  public static void main(String[] args) {
    Vehicle v1 = new Sedan();

    v1.model = "티코";
    v1.capacity = 5;

    ((Car)v1).cc = 1980;

    System.out.println(((Car)v1).cc);

    ((Sedan)v1).cc = 1902;
    System.out.println(((Car)v1).cc);
  }
}

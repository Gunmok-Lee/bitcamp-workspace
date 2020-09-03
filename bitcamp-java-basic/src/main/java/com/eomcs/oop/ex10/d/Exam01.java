package com.eomcs.oop.ex10.d;

public class Exam01 {

  public static void main(String[] args) {
    Hong h = new Hong();
    Kim k = new Kim();

    hi(h);

    System.out.println("--------------");

    hi(k);
  }

  static void hi(Student student) {

    student.introduce();
  }
}

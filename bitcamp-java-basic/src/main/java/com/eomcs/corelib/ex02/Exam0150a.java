package com.eomcs.corelib.ex02;

public class Exam0150a {
  static class Member{
    String name;
    int age;

    public Member(String name, int age) {
      this.name = name;
      this.age = age;
    }
  }

  public static void main(String[] args) {

    Member m1 = new Member("홍길동", 20);
    Member m2 = new Member("홍길동", 20);

  }
}

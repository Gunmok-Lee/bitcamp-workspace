package com.eomcs.corelib.ex01;

import java.util.HashSet;

public class Exam0150a {

  static class Student1 {
    String name;
    int age;
    boolean working;

    public Student1(String name, int age, boolean working) {
      this.name = name;
      this.age = age;
      this.working = working;
    }
  }
  public static void main(String[] args) {

    Student1 s1 = new Student1("홍길동", 20, false);
    Student1 s2 = new Student1("홍길동", 20, false);
    Student1 s3 = new Student1("임꺽정", 21, true);
    Student1 s4 = new Student1("유관순", 22, true);

    System.out.println(s1 == s2);

    System.out.println(s1.hashCode());
    System.out.println(s2.hashCode());
    System.out.println(s3.hashCode());
    System.out.println(s4.hashCode());
    System.out.println("--------------------");

    HashSet<Student1> set = new HashSet<Student1>();
    set.add(s1);
    set.add(s2);
    set.add(s3);
    set.add(s4);

    Object[] list = set.toArray();
    for (Object obj : list) {
      Student1 stu = (Student1) obj;
      System.out.printf("%s, %d, %s\n",
          stu.name, stu.age, stu.working ? "재직중" : "실업중");
    }
  }
}


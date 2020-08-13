package com.eomcs.corelib.ex01;

import java.util.HashMap;

public class Exam0152a {

  static class MyKey1{
    String contents;

    public MyKey1(String contents) {
      this.contents = contents;
    }

    @Override
    public String toString() {
      return "MyKey [contents=" + contents + "]";
    }

    public static void main(String[] args) {
      HashMap<MyKey1,Student> map = new HashMap<>();

      MyKey1 k1 = new MyKey1("ok");
      MyKey1 k2 = new MyKey1("no");
      MyKey1 k3 = new MyKey1("haha");
      MyKey1 k4 = new MyKey1("ohora");
      MyKey1 k5 = new MyKey1("hul");

      map.put(k1, new Student("홍", 20, false));
      map.put(k2, new Student("임", 30, true));
      map.put(k3, new Student("유", 17, true));
      map.put(k4, new Student("안", 24, true));
      map.put(k5, new Student("윤", 22, false));

      System.out.println(map.get(k3));

      MyKey1 k6 = new MyKey1("haha");

      System.out.println(map.get(k6));

      System.out.println(k3 == k6);
      System.out.printf("k3(%s), k6(%s)\n", k3, k6);
      System.out.println(k3.hashCode());
      System.out.println(k6.hashCode());

    }
  }
}

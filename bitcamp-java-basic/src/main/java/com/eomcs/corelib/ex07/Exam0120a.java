package com.eomcs.corelib.ex07;

import java.util.ArrayList;

public class Exam0120a {

  public static void main(String[] args) {
    String v1 = new String("aaa");
    String v2 = new String("bbb");
    String v3 = new String("ccc");
    String v4 = new String("ddd");
    String v5 = new String("ccc");

    ArrayList list = new ArrayList();
    list.add(v1);
    list.add(v2);
    list.add(v3);
    list.add(v4);
    list.add(v5);

    System.out.println(v3 == v5);
    System.out.println(v3.equals(v5));
    System.out.println(v3.hashCode() + "," + v5.hashCode());
    System.out.println("-------------------------------");

    print(list);
  }

  static void print(ArrayList list) {
    Object[] values = list.toArray();
    for (Object value : values) {
      System.out.print(value + ",");
    }
  }
}


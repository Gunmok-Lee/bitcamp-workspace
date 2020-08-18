package com.eomcs.corelib.ex07;

import java.util.Iterator;
import java.util.LinkedList;

public class Exam0220a {

  public static void main(String[] args) {
    String v1 = new String("aaa");
    String v2 = new String("bbb");
    String v3 = new String("ccc");
    String v4 = new String("ddd");
    String v5 = new String("ccc");

    LinkedList list = new LinkedList();
    list.add(v1);
    list.add(v2);
    list.add(v3);
    list.add(v4);
    list.add(v5);

    Iterator 꺼내기 = list.iterator();
    while (꺼내기.hasNext()) {
      System.out.print(꺼내기.next() + ", ");
    }
    System.out.println();
  }
}

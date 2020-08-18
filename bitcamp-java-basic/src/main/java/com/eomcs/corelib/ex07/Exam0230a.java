package com.eomcs.corelib.ex07;

import java.util.Iterator;
import java.util.Stack;

public class Exam0230a {
  public static void main(String[] args) {
    String v1 = new String("aaa");
    String v2 = new String("bbb");
    String v3 = new String("ccc");
    String v4 = new String("ddd");
    String v5 = new String("eee");

    Stack stack = new Stack();
    stack.add(v1);
    stack.add(v2);
    stack.add(v3);
    stack.add(v4);
    stack.add(v5);

    Iterator 꺼내기 = stack.iterator();
    while (꺼내기.hasNext()) {
      System.out.print(꺼내기.next() + ", ");
    }
    System.out.println();
  }
}

package com.eomcs.generic.ex02;

public class Exam0110a {
  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.add(new Member("홍길동", 20));
    list.add(new Member("임꺽정", 30));
    list.add(new Member("유관순", 16));

    list.add(new String("문자열!!!"));

    for (int i = 0; i < list.size(); i++) {
      Member member = (Member) list.get(i);
      System.out.printf("%s(%d)\n", member.name, member.age);
    }
  }
}

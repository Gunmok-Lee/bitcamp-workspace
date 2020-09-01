package com.eomcs.generic.ex01;

import java.util.ArrayList;

public class Exam0120a {


  public static void main(String[] args) {

    ArrayList<Member> list = new ArrayList<Member>();
    list.add(new Member("홍길동", 20));

    Member member = list.get(0);
    System.out.println(member.name);
    System.out.println(member.age);
  }
}

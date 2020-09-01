package com.eomcs.generic.ex01;

import java.util.ArrayList;

public class Exam0211a {
  public static void main(String[] args) {
    ArrayList list1;
    list1 = new ArrayList();
    list1= new ArrayList<>();
    list1= new ArrayList<Object>();
    list1= new ArrayList<String>();
    list1= new ArrayList<Member>();

    ArrayList<?> list2;
    list2 = new ArrayList();
    list2= new ArrayList<>();
    list2= new ArrayList<Object>();
    list2= new ArrayList<String>();
    list2= new ArrayList<Member>();
  }
}

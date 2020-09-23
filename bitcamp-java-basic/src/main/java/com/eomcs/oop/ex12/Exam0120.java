package com.eomcs.oop.ex12;

public class Exam0120 {

  interface Player {
    void paly();
  }

  public static void main(String[] args) {
    Player p1 = () -> System.out.println("테스트");
    p1.paly();

    Player p2 = () -> {
      System.out.println("테스트2");
    };
    p2.paly();
  }
}

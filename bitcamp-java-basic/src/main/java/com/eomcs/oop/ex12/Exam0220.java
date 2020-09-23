package com.eomcs.oop.ex12;

public class Exam0220 {


  interface Player {
    void play();
    void stop();
  }

  public static void main(String[] args) {
    Player p = () -> System.out.println("두개는 안돼!");
  }
}

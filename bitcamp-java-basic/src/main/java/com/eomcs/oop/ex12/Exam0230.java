package com.eomcs.oop.ex12;

public class Exam0230 {


  interface Player{

    static String info() {
      return "안녕하세요";
    }

    default void stop() {
      System.out.println("stop");
    }

    void play();
  }

  public static void main(String[] args) {

    Player p = () -> System.out.println("play!!");
    p.play();
    p.stop();
    System.out.println(Player.info());
  }
}

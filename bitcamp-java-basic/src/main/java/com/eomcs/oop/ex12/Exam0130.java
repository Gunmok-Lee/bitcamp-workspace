package com.eomcs.oop.ex12;

public class Exam0130 {

  interface Player {
    void play(String name);
  }

  public static void main(String[] args) {

    Player p1 = (String name) -> System.out.println(name + "님 반갑습니다.");
    p1.play("홍길동");

    Player p2 = (name) -> System.out.println(name + "님 환영합니다!");
    p2.play("임꺽정");

    Player p3 = name -> System.out.println(name + " 님 어서오세요");
    p3.play("유관순");
  }
}

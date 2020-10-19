package com.eomcs.concurrent.ex4;

public class Exam0210 {
  public static void main(String[] args) throws Exception {
    System.out.println("스레드 실행 전");

    Thread t = new Thread(() ->{
      for (int i = 0; i < 1000; i++) {
        System.out.println("===> " + i);
      }
    });

    t.start();
    t.join();

    System.out.println("스레드 종료 후");
  }
}

package com.eomcs.exception.ex3;

public class Exam0640 {

  static class A {

  }

  static class B {
    public void close() throws Exception {
      System.out.println("B클래스의 자원을 해제 하였습니다.");
    }
  }

  static class C implements AutoCloseable {
    @Override
    public void close() throws Exception {
      System.out.println("C클래스의 자원을 해제 하였습니다.");
    }
  }

  public static void main(String[] args) throws Exception {
    try (

        C obj3 = new C();
        ) {
      System.out.println("try블록실행");
    }

  }
}

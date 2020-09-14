package com.eomcs.exception.ex3;

public class Exam0641 {
  static class B implements AutoCloseable {
    public void m(int value) throws Exception {
      if (value < 0) {
        throw new Exception("음수입니다!");
      }
      System.out.println("M() 호출!");
    }

    @Override
    public void close() throws Exception{
      System.out.println("close() 호출!");

    }
  }

  public static void main(String [] args) throws Exception {
    try (B obj = new B()) {
      System.out.println("try start");
      obj.m(-100);

      System.out.println("try end");
    } catch (Exception e) {
      System.out.println("예외발생 " + e.getMessage());
    }
  }
}

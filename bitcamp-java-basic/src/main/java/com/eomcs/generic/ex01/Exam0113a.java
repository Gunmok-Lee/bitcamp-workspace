package com.eomcs.generic.ex01;

public class Exam0113a {

  static class Box<T> {

    T value;

    public void set(T value) {
      this.value = value;
    }

    public T get() {
      return value;
    }
  }

  public static void main(String[] args) {

    Box<Member> box1;

    box1 = new Box<Member>();

    box1 = new Box<>();

    box1.set(new Member("홍길동", 20));

    Member m = box1.get();
    System.out.println(m);
  }
}

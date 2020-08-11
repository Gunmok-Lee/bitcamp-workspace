package com.eomcs.oop.ex06.a;

public class Exam0111a {

  public static void main(String[] args) {
    Vehiclea v = new Vehiclea();
    Bikea b = new Bikea();
    Cara c = new Cara();
    Sedana s = new Sedana();
    Trucka t = new Trucka();

    Vehiclea v2 = null;

    v = b;
    v2 = b;
    v = c;
    v2 = c;
    v = s;
    v2 = s;
    v = t;
    v2 = t;

    v2.model = "티코";
    v2.capacity = 5;
  }
}

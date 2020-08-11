package com.eomcs.oop.ex06.a;

public class Exam0112a {
  public static void main(String[] args) {
    Vehiclea v = new Vehiclea();
    Bikea b = new Bikea();
    Cara c = new Cara();
    Sedana s = new Sedana();
    Trucka t = new Trucka();

    Bike b2 = null;

    b2 = v;

    b2.engine = true;
  }
}

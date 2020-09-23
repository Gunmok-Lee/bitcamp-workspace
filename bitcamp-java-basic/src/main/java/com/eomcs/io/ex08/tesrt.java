package com.eomcs.io.ex08;

public class tesrt {
  public static void main(String[] args) {
    byte i = (byte) 33000;

    System.out.println(i);
    int len = i >> 8;
    len += i ;

    System.out.println(len);
  }
}

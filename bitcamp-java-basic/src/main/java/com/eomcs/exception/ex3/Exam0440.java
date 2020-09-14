package com.eomcs.exception.ex3;

import java.io.IOException;
import java.sql.SQLException;

public class Exam0440 {
  static void m(int i) throws Exception {
    if (i == 0)
      throw new Exception();
    else if (i ==1)
      throw new RuntimeException();
    else if (i == 2)
      throw new SQLException();
    else
      throw new IOException();
  }
  public static void main(String[] args) {

    try {
      m(1);
      System.out.println("실행성공");
    } catch (Exception e) {
      System.out.println("기타 Exception 발생");

    } catch (IOException e) {
      System.out.println("IOException 발생");

    } catch (SQLException e) {
      System.out.println("SQLException 발생");

    } catch (RuntimeException e) {
      System.out.println("RuntimeException 발생");

    }
  }

}
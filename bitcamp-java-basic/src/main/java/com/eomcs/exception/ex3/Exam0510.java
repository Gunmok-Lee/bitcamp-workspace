package com.eomcs.exception.ex3;

import java.io.IOException;
import java.sql.SQLException;

public class Exam0510 {
  static void m (int i) throws Exception{
    if (i == 0)
      throw new Exception();
    else if (i == 1)
      throw new RuntimeException();
    else if (i == 2)
      throw new SQLException();
    else if (i == 3)
      throw new IOException();
  }

  public static void main(String[] args) {
    try {
      m(0);
      System.out.println("try");
    } catch (RuntimeException | SQLException | IOException e) {
      System.out.println("catch 1");
    } catch (Exception e) {
      System.out.println("catch 2");
    } finally {
      System.out.println("finally");
    }
  }
}

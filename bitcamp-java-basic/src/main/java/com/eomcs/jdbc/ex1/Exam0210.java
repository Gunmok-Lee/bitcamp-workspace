package com.eomcs.jdbc.ex1;

import java.sql.DriverManager;
import org.mariadb.jdbc.MariaDbConnection;

public class Exam0210 {
  public static void main(String[] args) {
    try {

      MariaDbConnection con = (MariaDbConnection)DriverManager.getConnection(
          "jdbc:mariadb://localhost:3306/studydb",
          "study",
          "1111");

      System.out.println("DBMS와 연결됨!");

      System.out.println(con.getClass().getName());


    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

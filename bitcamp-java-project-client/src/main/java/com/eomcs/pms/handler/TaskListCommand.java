package com.eomcs.pms.handler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TaskListCommand implements Command {

  @Override
  public void execute() {
    System.out.println("[작업 목록]");

    try (Connection con = DriverManager.getConnection( //
        "jdbc:mysql://localhost:3306/studydb?user=study&password=1111");
        PreparedStatement stmt = con.prepareStatement( //
            "select no, content, deadline, owner, status"
            + " from pms_task "
            + " order by no desc");
        ResultSet rs = stmt.executeQuery()) {

      while (rs.next()) {
        System.out.printf("%d, %s, %s, %s, %d\n", //
            rs.getInt("no"), //
            rs.getString("content"), //
            rs.getDate("deadline"), //
            rs.getString("owner"), //
            rs.getInt("status"));

      }
    }catch (Exception e) {
      System.out.println("데이터 목록 조회 중 오류 발생!");
      e.printStackTrace();
    }
  }
}

package com.eomcs.pms.handler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.eomcs.util.Prompt;

public class TaskDetailCommand implements Command {

  @Override
  public void execute() {
    System.out.println("[작업 상세보기]");
    int no = Prompt.inputInt("번호? ");

    try (Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/studydb?user=study&password=1111");
        PreparedStatement stmt = con.prepareStatement(
            "select content, deadline, owner, status"
                + " from pms_task"
                + " where no = " + no);
        ResultSet rs = stmt.executeQuery()) {

      if (rs.next()) {

        System.out.printf("내용: %s\n", rs.getString("content"));
        System.out.printf("마감일: %s\n", rs.getDate("deadline"));
        System.out.printf("담당자: %s\n", rs.getString("owner"));
        System.out.printf("상태: %d\n", rs.getInt("status"));


      } else {
        System.out.println("해당 번호의 작업이 존재하지 않습니다.");
      }
    } catch (Exception e) {
      System.out.println("작업 조회 중 오류 발생!");
      e.printStackTrace();
    }


  }
}

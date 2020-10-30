package com.eomcs.pms.handler;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.eomcs.util.Prompt;

public class TaskUpdateCommand implements Command {

  @Override
  public void execute() {
    System.out.println("[작업 변경]");
    int no = Prompt.inputInt("번호? ");

    String content = null;
    Date deadline = null;
    String owner = null;
    int status;

    try (Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/studydb?user=study&password=1111");
        PreparedStatement stmt = con.prepareStatement(
            "select content, deadline, owner, status"
                + " from pms_task"
                + " where no = " + no);
        ResultSet rs = stmt.executeQuery()) {

      if (rs.next()) {

        content = rs.getString("content");
        deadline = rs.getDate("deadline");
        owner = rs.getString("owner");
        status = rs.getInt("status");


      } else {
        System.out.println("해당 번호의 작업이 존재하지 않습니다.");
        return;
      }
    } catch (Exception e) {
      System.out.println("작업 변경 중 오류 발생!");
      e.printStackTrace();
      return;
    }

    content = Prompt.inputString(String.format("내용(%s)? ", content));
    deadline = Prompt.inputDate(String.format("마감일(%s)? ", deadline));
    owner = Prompt.inputString(String.format("만든이(%s)? ", owner));
    status = Prompt.inputInt(String.format("상태(%s)? ", status));

    String response = Prompt.inputString("정말 변경하시겠습니까?(y/N) ");
    if (!response.equalsIgnoreCase("y")) {
      System.out.println("회원 변경을 취소하였습니다.");
      return;
    }

    try (Connection con = DriverManager.getConnection( //
        "jdbc:mysql://localhost:3306/studydb?user=study&password=1111");
        PreparedStatement stmt = con.prepareStatement( //
            "update pms_task set content = ?, deadline = ?, owner = ?, status =?"
            + " where no = ?")) {

      stmt.setString(1, content);
      stmt.setDate(2, deadline);
      stmt.setString(3, owner);
      stmt.setInt(4, status);
      stmt.setInt(5, no);
      int count = stmt.executeUpdate();

      if (count == 0) {
        System.out.println("해당 번호의 프로젝트가 존재하지 않습니다.");
      } else {
        System.out.println("변경하였습니다.");
      }
    } catch (Exception e) {
      System.out.println("프로젝트 변경 중 오류 발생!");
      e.printStackTrace();
    }
  }
}

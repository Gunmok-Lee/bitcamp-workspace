package com.eomcs.pms.handler;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.eomcs.util.Prompt;

public class ProjectUpdateCommand implements Command {

  @Override
  public void execute() {
    System.out.println("[프로젝트 변경]");
    int no = Prompt.inputInt("번호? ");

    String title = null;
    String content = null;
    Date startDate = null;
    Date endDate = null;
    String owner = null;
    String members = null;

    try (Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/studydb?user=study&password=1111");
        PreparedStatement stmt = con.prepareStatement(
            "select title, content, sdt, edt, owner, members"
                + " from pms_project"
                + " where no = " + no);
        ResultSet rs = stmt.executeQuery()) {

      if (rs.next()) {

        title = rs.getString("title");
        content = rs.getString("content");
        startDate = rs.getDate("sdt");
        endDate = rs.getDate("edt");
        owner = rs.getString("owner");
        members = rs.getString("members");


      } else {
        System.out.println("해당 번호의 프로젝트가 존재하지 않습니다.");
        return;
      }
    } catch (Exception e) {
      System.out.println("프로젝트 변경 중 오류 발생!");
      e.printStackTrace();
      return;
    }

    title = Prompt.inputString(String.format("프로젝트명(%s)? ", title));
    content = Prompt.inputString(String.format("내용(%s)? ", content));
    startDate = Prompt.inputDate(String.format("시작일(%s)? ", startDate));
    startDate = Prompt.inputDate(String.format("종료일(%s)? ", endDate));
    owner = Prompt.inputString(String.format("만든이(%s)? ", owner));
    members = Prompt.inputString(String.format("팀원(%s)? ", members));

    String response = Prompt.inputString("정말 변경하시겠습니까?(y/N) ");
    if (!response.equalsIgnoreCase("y")) {
      System.out.println("회원 변경을 취소하였습니다.");
      return;
    }

    try (Connection con = DriverManager.getConnection( //
        "jdbc:mysql://localhost:3306/studydb?user=study&password=1111");
        PreparedStatement stmt = con.prepareStatement( //
            "update pms_project set title = ?, content = ?, sdt = ?, edt =?,"
            + " owner = ?, members = ?"
            + " where no = ?")) {

      stmt.setString(1, title);
      stmt.setString(2, content);
      stmt.setDate(3, startDate);
      stmt.setDate(4, endDate);
      stmt.setString(5, owner);
      stmt.setString(6, members);
      stmt.setInt(7, no);
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

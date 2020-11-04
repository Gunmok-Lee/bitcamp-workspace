package com.eomcs.jdbc.ex2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Exam0411 {

  public static void main(String[] args) throws Exception {
    String title = null;
    String contents = null;
    ArrayList<String> files = new ArrayList<>();

    try (Scanner keyScan = new Scanner(System.in)) {
      System.out.print("제목? ");
      title = keyScan.nextLine();

      System.out.print("내용? ");
      contents = keyScan.nextLine();

      // 사용자로부터 첨부파일 입력받기
      while (true) {
        System.out.print("첨부파일:(완료는 그냥 엔터!) ");
        String filename = keyScan.nextLine();
        if (filename.length() == 0) {
          break;
        }
        files.add(filename);
      }
    }

    try (Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/studydb?user=study&password=1111");

        // 게시글 입력 처리 객체
        PreparedStatement boardstmt = con.prepareStatement(
            "insert into x_board(title,contents) values(?,?)"
            Statement.RETURN_GENERATED_KEYS);

        // 첨부파일 입력 처리 객체
        PreparedStatement filestmt = con.prepareStatement(
            "insert into x_board_file(file_path,board_id) values(?,?)")) {

      // 게시글 입력
      boardstmt.setString(1, title);
      boardstmt.setString(2, contents);

      int count = boardstmt.executeUpdate();
      System.out.printf("%d 개 게시글 입력성공!", count);

      // 첨부파일 입력
      int fileCount = 0;
      for (String filename : files) {
        filestmt.setString(1, filename);
        filestmt.setInt(2, 0);
        filestmt.executeUpdate();
        fileCount++;
      }
      System.out.printf("%d 개 첨부파일 입력성공!", fileCount);
    }
  }
}
package com.eomcs.design_pattern.flyweight.before;

import java.util.Scanner;

public class BrushTest {

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    while (true) {
      System.out.print("패턴? ");
      String pattern = keyboard.nextLine();

      System.out.print("선 길이? ");
      int length = Integer.parseInt(keyboard.nextLine());
      if (length < 0)
        break;

      // 계속 새로운 Brush 생성으로 인한 가비지 발생
      // Brush를 재사용 하여 해결함
      Brush brush = new Brush(pattern);
      brush.draw(length);
    }
    keyboard.close();
  }
}

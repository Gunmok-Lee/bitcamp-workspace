package com.eomcs.design_pattern.flyweight.after;

import java.util.Scanner;

public class BrushTest {

  public static void main(String[] args) {
    BrushPool brushPool = new BrushPool();


    Scanner keyboard = new Scanner(System.in);

    while (true) {
      System.out.print("패턴? ");
      String pattern = keyboard.nextLine();

      System.out.print("선 길이? ");
      int length = Integer.parseInt(keyboard.nextLine());
      if (length < 0)
        break;

      // 이렇게 객체를 다시 재사용하는 기법을 Pooling 기법이고 디자인패턴으로는
      // Flywegith 패턴이라 한다.
      Brush brush = brushPool.getBrush(pattern);
      brush.draw(length);
    }
    keyboard.close();
  }
}

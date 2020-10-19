package com.eomcs.design_pattern.flyweight.after;

import java.util.HashMap;
import java.util.Map;

// 생성된 Brush 객체를 보관하였다가 필요할때 꺼내주는 객체
// 이러한 기법을 Flyweight 디자인 패턴이라고함
// 메모리를 효율적인 사용 가능
public class BrushPool {
  Map<String,Brush> brushMap = new HashMap<>();

  // 브러쉬를 리턴하는 메서드
  public Brush getBrush(String pattern) {
    Brush brush = brushMap.get(pattern);
    if (brush == null) {
      System.out.printf("%s 브러쉬 생성\n", pattern);
      brush = new Brush(pattern);
      brushMap.put(pattern, brush);
    }
    return brush;
  }
}

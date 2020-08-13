package com.eomcs.corelib.ex01;

import java.util.HashMap;

public class Exam0153a {

  static class MyKey3 {
    String contents;

    public MyKey3(String contents) {
      this.contents = contents;
    }

    @Override
    public String toString() {
      return "MyKey3 [contents=" + contents + "]";
    }

    @Override
    public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((contents == null) ? 0 : contents.hashCode());
      return result;
    }
    @Override
    public boolean equals(Object obj) {
      if (this == obj)
        return true;
      if (obj == null)
        return false;
      if (getClass() != obj.getClass())
        return false;
      MyKey3 other = (MyKey3) obj;
      if (contents == null) {
        if (other.contents != null)
          return false;
      } else if (!contents.equals(other.contents))
        return false;
      return true;
    }
  }
  public static void main(String[] args) {
    HashMap<MyKey3,Student> map = new HashMap<>();

    MyKey3 k1 = new MyKey3("ok");
    MyKey3 k2 = new MyKey3("no");
    MyKey3 k3 = new MyKey3("haha");
    MyKey3 k4 = new MyKey3("ohora");
    MyKey3 k5 = new MyKey3("hul");

    map.put(k1, new Student("홍길동", 20, false));
    map.put(k2, new Student("임꺽정", 30, true));
    map.put(k3, new Student("유관순", 17, true));
    map.put(k4, new Student("안중근", 24, true));
    map.put(k5, new Student("윤봉길", 22, false));

    System.out.println(map.get(k3));

    MyKey3 k6 = new MyKey3("haha");

    System.out.println(map.get(k6));

    System.out.println(k3 == k6);
    System.out.printf("k3(%s), k6(%s)\n", k3, k6);
    System.out.println(k3.hashCode()); // hash code는 같다.
    System.out.println(k6.hashCode()); // hash code는 같다.
    System.out.println(k3.equals(k6)); // equals()의 비교 결과도 같다.

  }
}

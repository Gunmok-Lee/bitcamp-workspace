package com.eomcs.generic.ex01;

import java.util.HashMap;

public class Exan0310a {
  public static void main(String[] args) {
    HashMap map = new HashMap();
    map.put("aaa", "문자열");
    map.put(new Integer(100), new Member("홍길동", 20));

    HashMap<Object,Object> map2 = new HashMap<>();
    map2.put("aaa", "문자열");
    map2.put(new Integer(100), new Member("홍길동", 20));

    HashMap<String,Member> map3 = new HashMap<>();
    map3.put("aaa", new Member("홍길동", 20));

    Member m = map3.get("aaa");
    System.out.println(m);
  }
}

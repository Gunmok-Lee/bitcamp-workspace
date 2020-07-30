package com.eomcs.basic.ex06;


// switch 문법
public class Exam0231 {
  public static void main(String[] args) {
    // switch (값) {}


    // case에는 리터럴만 올 수 있다.
    // 즉 변수를 사용할 수 없다.
    int x = 1, y = 300;
    switch (x) {
      case 1 * 300: // OK
        //case 1 * y: // 컴파일 오류!
        //그러나 만약 y를 final을 통해 상수화 시키면 사용가능

    }
  }
}

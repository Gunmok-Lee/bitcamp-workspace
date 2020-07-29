package com.eomcs.basic.ex05;

public class Exam0220a {
  public static void main(String[] args) {
    double d1 = 987.6543;
    double d2 = 1.111111;
    System.out.println((d1 + d2) == 988.765411);
    // false다
    // 부동 소수점은 산술 연산도중 쓰레기 값이 발생하는 경우가 많아
    // 그 값이 왜곡 된다.
    System.out.println(d1 + d2);
    // 결과 값에 극소수의 값이 붙는다.
    
    double x = 234.765411;
    double y = 754.0;
    System.out.println((x + y) == 988.765411);
    
    System.out.println(x + y);
    // 위에 경우와는 다르게 쓰레기 값이 붙지 않았다.
    // 따라서 해당 상황을 해결하기 위해 사용하는 방법은
    
    System.out.println((d1 + d2) == (x + y));
    // 해당식이 false가 나오고 true가 나오기위해 뒤에 극소수값을 무시해준다.
    
    double EPSILON = 0.00001;
    System.out.println(Math.abs((d1 + d2) - (x + y)) < EPSILON);
    
    // 쓰레기값을 지정하여 둘의 값의 차가 그보다 작으면 true를 만들도록 생성한다.
    // Math.abs 는 지정한 쓰레기 값(EPSILON)이 양수이니 차액을 양수로 만들어주기 위한
    // 절대값으로 전환하는 방법이다.
    
    System.out.println(Math.abs(-100)); // => 100 출력
    System.out.println(Math.abs(100));  // => 100 출력
  }
}

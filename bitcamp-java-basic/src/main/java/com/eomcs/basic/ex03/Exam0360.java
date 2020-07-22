// 주제: 부동소수점의 정규화 = 2진수로 바꾸기

package com.eomcs.basic.ex03;


class Exam360 { 
    public static void main(String[] args) {
        System.out.println(12.375f);
        System.out.println(12.375);
        
        System.out.println(-12.375f);

        // 12.375(부동소수점) 정규화 결과
        // ==> IEEE 754 규정에 따라 부동 소수점을 2진수로 변환한다.
        // ==> 01000001 01000110 00000000 00000000(2잔수)
        // ==> 41460000(16진수)
    }
}               

//방법
// 1) 정수 부분을 2진수로 변환
// - 12(10진수)
// - 1100(2진수)
//
// 2) 소수점 이하 부분을 2진수로 변환
// - .375
package com.eomcs.corelib.ex01;

public class Exam0170a {

  static class Score1 {

    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;

    public Score1() {}

    public Score1(String name, int kor, int eng, int math) {
      this.name = name;
      this.kor = kor;
      this.eng = eng;
      this.math =math;
      this.sum = this.kor + this.eng + this.math;
      this.aver = this.sum / 3f;
    }
    @Override
    public String toString() {
      return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", sum="
          + sum + ", aver=" + aver + "]";
    }
  }
  public static void main(String[] args) {

    Score1 s1 = new Score1("이건목", 100, 100, 100);
    System.out.println(s1);

    Score1 s2 = new Score1(s1.name, s1.kor, s1.eng, s1.math);

    System.out.println(s2);
  }
}

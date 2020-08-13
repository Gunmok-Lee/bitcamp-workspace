package com.eomcs.corelib.ex01;

public class Exam0171a {

  static class Score2 {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;

    public Score2() {}

    public Score2(String name, int kor, int eng, int math) {
      this.name = name;
      this.kor = kor;
      this.eng = eng;
      this.math = math;
      this.sum = this.kor + this.eng + this.math;
      this.aver = this.sum / 3f;
    }
    @Override
    public String toString() {
      return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", sum="
          + sum + ", aver=" + aver + "]";
    }
    @Override
    public Score2 clone() throws CloneNotSupportedException {
      return (Score2) super.clone();
    }
  }
  public static void main(String[] args) throws Exception {
    Score2 s1 = new Score2("이건목", 100, 100, 100);
    //Score2 s2 = s1.clone();

    //System.out.println(s1 == s2);
    System.out.println(s1);
    //System.out.println(s2);
  }
}

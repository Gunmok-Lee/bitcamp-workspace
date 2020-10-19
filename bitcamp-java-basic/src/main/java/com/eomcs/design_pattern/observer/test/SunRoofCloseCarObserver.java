package com.eomcs.design_pattern.observer.test;

public class SunRoofCloseCarObserver extends AbstractCarObserver {

  @Override
  public void CarStopped() {
    System.out.println("썬루프를 닫는다!");
  }

}

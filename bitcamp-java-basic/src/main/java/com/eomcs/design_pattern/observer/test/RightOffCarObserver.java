package com.eomcs.design_pattern.observer.test;

public class RightOffCarObserver extends AbstractCarObserver {

  @Override
  public void CarStopped() {
    System.out.println("전조등 끔!");
  }

}

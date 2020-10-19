package com.eomcs.design_pattern.observer.test;

public class EngineOilCarObserver extends AbstractCarObserver {

  @Override
  public void CarStarted() {
    System.out.println("엔진 오일 검사!");
  }

}

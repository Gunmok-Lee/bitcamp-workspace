package com.eomcs.util.Concurrent;

import java.util.ArrayList;
import java.util.List;

public class ThreadPool {

  List<Worker> workers = new ArrayList<>();

  private class Worker extends Thread {
    Runnable task;

    public void setTask(Runnable task) {
      this.task = task;
      synchronized (this) {
        this.notify();
      }
    }

    @Override
    public void run() {
      synchronized (this) {
        try {
          while (true) {
            this.wait();

            task.run();
            workers.add(this);
            System.out.println("스레드플로 되돌아감!");
          }
        } catch (Exception e) {
          System.out.printf("%s 스레드에서 오류 발생! - 스레드폴에소 제거\n", this.getName());
          workers.remove(this);
        }
      }
    }
  }

  public void excute(Runnable task) {
    Worker t = null;
    if (workers.isEmpty()) {
      t = new Worker();
      t.start();
      System.out.printf("새 스레드(%s) 생성 및 실행!\n", t.getName());
    } else {
      t = workers.remove(0);
      System.out.printf("기존 스레드(%s) 사용!\n", t.getName());
    }

    t.setTask(task);
  }
}

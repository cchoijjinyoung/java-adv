package thread.start.test;

import util.MyLogger;

public class StartTest4Main {

  public static void main(String[] args) {
    PrintWork a = new PrintWork("A", 1000);
    PrintWork b = new PrintWork("B", 500);

    Thread threadA = new Thread(a, "Thread-A");
    Thread threadB = new Thread(b, "Thread-B");

    threadA.start();
    threadB.start();
  }

  static class PrintWork implements Runnable {

    private String content;
    private int sleepMs;

    public PrintWork(String content, int sleepMs) {
      this.content = content;
      this.sleepMs = sleepMs;
    }

    @Override
    public void run() {
      while (true) {
        MyLogger.log(content);
        try {
          Thread.sleep(sleepMs);
        } catch (InterruptedException e) {
          throw new RuntimeException(e); // 체크 예외로 못 바꾼다.
        }
      }
    }
  }
}

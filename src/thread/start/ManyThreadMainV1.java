package thread.start;

import static util.MyLogger.*;

import util.MyLogger;

public class ManyThreadMainV1 {

  public static void main(String[] args) {
    log("main() start");

    HelloRunnable runnable = new HelloRunnable();
    Thread thread1 = new Thread(runnable);
    thread1.start();
    Thread thread2 = new Thread(runnable);
    thread2.start();
    Thread thread3 = new Thread(runnable);
    thread3.start();

    // 3개의 스레드에 HelloRunnable(x001) 인스턴스를 던져줬다. 따라서 세 스레드 모두 HelloRunnable의 run() 메서드를 실행한다.

    log("main() end");
  }
}

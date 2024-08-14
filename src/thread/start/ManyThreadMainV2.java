package thread.start;

import static util.MyLogger.log;

/**
 * 100개의 스레드를 만들어보자
 * 스레드의 실행 순서는 보장되지 않는다.
 */
public class ManyThreadMainV2 {

  public static void main(String[] args) {
    log("main() start");

    HelloRunnable runnable = new HelloRunnable();
    for (int i = 0; i < 100; i++) {
      Thread thread = new Thread(runnable);
      thread.start();
    }
    log("main() end");
  }
}

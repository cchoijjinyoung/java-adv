package thread.start.innerrunnable;

import static util.MyLogger.*;

/**
 * 이 클래스에서만 사용할거면, 중첩 클래스로 만드는게 더 낫다.
 */
public class InnerRunnableMainV1 {

  public static void main(String[] args) {
    log("main() start");

    MyRunnable runnable = new MyRunnable();
    Thread thread = new Thread(runnable);
    thread.start();

    log("main() end");
  }

  static class MyRunnable implements Runnable {
    @Override
    public void run() {
      log("run()");
    }
  }
}

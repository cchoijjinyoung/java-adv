package thread.start.innerrunnable;

import static util.MyLogger.log;

/**
 * 특정 메서드 안에서만 간단히 정의하고 사용하고 싶다면 익명 클래스를 사용하면 된다.
 * 더 간단히 하고 싶으면 굳이 변수로 안빼내고, 익명 클래스를 바로 파라미터로 넘겨준다.
 */
public class InnerRunnableMainV3 {

  public static void main(String[] args) {
    log("main() start");

    Thread thread = new Thread(new Runnable() {
      @Override
      public void run() {
        log("run()");
      }
    });
    thread.start();

    log("main() end");
  }
}

package thread.start;

public class DaemonThreadMain {

  /**
   * 자바가 데몬 스레드가 끝나지도 않았는데 꺼져버림.
   * 메인 스레드가 끝나버렸고, 남은 게 데몬 스레드 밖에 없기때문에 끝나버린다.
   * 따라서, setDaemon(false)로 바꾸면 자바가 종료되지 않는다.
   * 데몬 스레드 여부는 `start()` 실행 전에 결정해야한다.
   */
  public static void main(String[] args) {
    System.out.println(Thread.currentThread().getName() + ": main() start");
    DaemonThread daemonThread = new DaemonThread();
    daemonThread.setDaemon(true); // 데몬 스레드 여부
    daemonThread.start();
    System.out.println(Thread.currentThread().getName() + ": main() end");
  }

  static class DaemonThread extends Thread {
    @Override
    public void run() {
      System.out.println(Thread.currentThread().getName() + ": run()");
      try {
        Thread.sleep(10000);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
      System.out.println(Thread.currentThread().getName() + ": run() end");
    }
  }
  /* 실행 결과
   * main: main() start
   * main: main() end
   * Thread-0: run()
   * Process finished with exit code 0
   */
}

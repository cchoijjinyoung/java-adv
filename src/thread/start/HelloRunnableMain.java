package thread.start;

public class HelloRunnableMain {

  /**
   * 스레드를 사용할 때는 `Thread`를 상속받는 방법보다 `Runnable` 인터페이스를 구현하는 방식을 사용하자.
   * 실행 결과는 기존과 같지만, 스레드와 해당 스레드가 실행할 작업이 서로 분리되어 있다는 차이가 있다.
   *
   * 또한 Thread 클래스를 상속하는 방법은 자바가 단일 상속만을 허용하기 때문에, Thread 외에 다른 클래스를 상속받는 것이 불가하다.
   * 같은 맥락으로 인터페이스를 사용하는 방법에 비해 유연성이 떨어진다.
   */
  public static void main(String[] args) {
    System.out.println(Thread.currentThread().getName() + ": main() start");
    HelloRunnable runnable = new HelloRunnable();
    Thread thread = new Thread(runnable); // runnable 작업을 받는다.
    thread.start();
    System.out.println(Thread.currentThread().getName() + ": main() end");
  }

}

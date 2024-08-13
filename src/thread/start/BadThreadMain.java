package thread.start;

public class BadThreadMain {

  public static void main(String[] args) {
    System.out.println(Thread.currentThread().getName() + ": main() start");

    HelloThread helloThread = new HelloThread();
    System.out.println(Thread.currentThread().getName() + ": run() 호출 전");
    helloThread.run(); // start()를 호출해야하지만 run() 직접 실행
    System.out.println(Thread.currentThread().getName() + ": run() 호출 후");

    System.out.println(Thread.currentThread().getName() + ": main() end");
  }
  /* 실행 결과
   * main: main() start
   * main: run() 호출 전
   * main: run() -> 별도의 스레드가 run()을 실행하는 것이 아닌 main 스레드가 run() 메서드를 호출한다.
   * main: run() 호출 후
   * main: main() end
   */
}

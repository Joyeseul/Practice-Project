package com.ysjo.section01;

public class Thread01 {
    public static void main(String[] args) {
        //http://www.tcpschool.com/java/java_thread_concept 참고
        
        /* Thread 클래스를 상속받는 방법으로 스레드 생성 */
        ThreadWithClass thread1 = new ThreadWithClass();

        /* Runnable 인터페이스를 구현하는 방법으로 스레드 생성
        * 상속받기 편하라고 인터페이스를 이용하는 것이 권장됨
        * 이게 더 특이하네?? ()안에 Runnable target 의 이름을 적는다 */
        Thread thread2 = new Thread(new ThreadWithRunnable());

        thread1.start();
        thread2.start();

    }
}

class ThreadWithClass extends Thread {
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()); //이 스레드의 이름 반환
            try {
                Thread.sleep(10);   //0.01초 간 스레드를 멈춤
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ThreadWithRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()); //현재 실행중인 스레드의 이름 반환
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

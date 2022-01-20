package com.ysjo.section01;

public class Thread02 {
    public static void main(String[] args) {
        //http://www.tcpschool.com/java/java_thread_concept

        Thread thread01 = new Thread(new ThreadWithRunnable());
        Thread thread02 = new Thread(new ThreadWithRunnable());

        thread02.setPriority(10);   //thread2의 우선순위를 10으로 변경

        thread01.start();       // Thread-0 실행
        thread02.start();       // Thread-1 실행

        System.out.println(thread01.getPriority());
        System.out.println(thread02.getPriority());
    }
}

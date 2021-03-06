package com.ysjo.section01;

public class Lamda01 {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("전통적 방식의 일회용 스레드 생성");
            }
        }).start();

        new Thread(()->{
            System.out.println("람다 표현식을 이용한 일회용 스레드 생성");
        }).start();
    }
}

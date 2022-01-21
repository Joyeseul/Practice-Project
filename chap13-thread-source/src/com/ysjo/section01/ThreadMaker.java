package com.ysjo.section01;

public class ThreadMaker extends Thread{

    protected ThreadSynchronizedTest tst;

    public ThreadMaker(ThreadSynchronizedTest tst) {
        this.tst = tst;
    }

    public void run() {
        for(int i = 0; i < 10; i++) {
            tst.setMemory(i);   //피보나치로 증가
        }
    }
}

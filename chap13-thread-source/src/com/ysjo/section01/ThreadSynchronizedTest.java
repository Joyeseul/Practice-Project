package com.ysjo.section01;

public class ThreadSynchronizedTest {
    private int memory;

    public int getMemory(){ return memory; }

    /* 동기화가 처리된 인스턴스 메소드 */
    public synchronized void setMemory(int memory) {
        this.memory += memory;

        System.out.println(Thread.currentThread().getName() + " : " + this.memory);
    }

}

package com.ysjo.section01;

public class ThreadSynchronizedExample2 {
    public static void main(String[] args) {
        /* https://soulduse.tistory.com/44
         * "스레드 동기화 synchronized 에 관해서" 번역글인 듯 */

        ThreadSynchronizedTest tstA = new ThreadSynchronizedTest();
        ThreadSynchronizedTest tstB = new ThreadSynchronizedTest();

        Thread threadC = new ThreadMaker(tstA);
        Thread threadD = new ThreadMaker(tstB);

        threadC.start();
        threadD.start();
        /* threadC, threadD 는 더이상 같은 인스턴스를 참조하지 않는다. setMemory() 메소드는 각자의 인스턴스를 기준으로 동기화된다.
        tstA 에 대한 setMemory() 메소드 호출은 tstB 의 setMemory() 를 블록시키지 않는다.
        따라서 Thread-0과 Thread-1이 섞여서 실행된다. */

    }
}

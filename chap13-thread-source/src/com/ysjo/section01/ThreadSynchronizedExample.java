package com.ysjo.section01;

public class ThreadSynchronizedExample {

    public static void main(String[] args) {
        /* https://soulduse.tistory.com/44
        * "스레드 동기화 synchronized 에 관해서" 번역글인 듯 */
        ThreadSynchronizedTest tst = new ThreadSynchronizedTest();

        Thread threadA = new ThreadMaker(tst);
        Thread threadB = new ThreadMaker(tst);

        threadA.start();
        threadB.start();

        /* 두 쓰레드가 생성되었고, 같은 ThreadSynchronizedTest 인스턴스가 각 쓰레드의 생성자로 전달되었다.
        ThreadSynchronizedTest.setMemory() 메소드는 인스턴스 메소드이기 때문에, setMemory() 메소드는 생성자로 전달된 ThreadSynchronizedTest 인스턴스를 기준으로 동기화된다.
        이로써 한 시점에 두 쓰레드 중 한 쓰레드만이 setMemory() 메소드를 호출할 수 있게 되었다.
        한 쓰레드가 setMemory() 메소드를 실행하는 동안 다른 쓰레드는 이 실행이 끝나고 실행 쓰레드가 동기화 블록을 빠져나갈 때까지 기다리게 된다.

        여기서 만일 두 쓰레드가 서로 다른 ThreadSynchronizedTest 인스턴스를 전달받았다면, setMemory() 메소드는 동시에 호출될 수 있을 것이다.
        setMemory() 메소드의 호출은 서로 다른 객체에 의해 이루어지고, 당연히 동기화의 기준이 달라진다.
        여기에 쓰레드가 블록 상태에 놓이는 일은 없다. */


        /* 아래내용을 제대로 보려먼 이것만 다른 Example 을 만들어서 따로 실행시켜봐야 할듯. 지금은 ABCD가 다 섞인다 */
        ThreadSynchronizedTest tstA = new ThreadSynchronizedTest();
        ThreadSynchronizedTest tstB = new ThreadSynchronizedTest();

        Thread threadC = new ThreadMaker(tstA);
        Thread threadD = new ThreadMaker(tstB);

        threadC.start();
        threadD.start();
        /* threadC, threadD 는 더이상 같은 인스턴스를 참조하지 않는다. setMemory() 메소드는 각자의 인스턴스를 기준으로 동기화된다.
        tstA 에 대한 setMemory() 메소드 호출은 tstB 의 setMemory() 를 블록시키지 않는다. */

    }
}

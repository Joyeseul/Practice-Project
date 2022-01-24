package com.ysjo.section01;

public class Lamda02 {
    public static void main(String[] args) {
        /* 함수형 인터페이스 */

        /* 원래대로 (익명클래스로 추상 메소드를 구현) */
        Calc objectMinNum = new Calc() {
            @Override
            public int min(int x, int y) {
                return x < y? x: y;
            }
        };
        
        /* 추상 메소드의 구현 (람다식)
        * 람다는 익명'객체'이므로, 이를 다루기위한 참조변수인 minNum 이 필요함.  */
        Calc minNum = ((x, y) -> x < y? x: y);

        /* 함수형 인터페이스의 사용
        * 신기하네... minNum을 부르고, 걔의 추상메소드인 minNum()을 호출하네 */
        System.out.println("result : " + minNum.min(3, 4));
    }
}

@FunctionalInterface
interface Calc {        // 함수형 인터페이스의 선언

    /* 단 하나의 추상 메서드만 선언된 인터페이스임 */
    int min(int x, int y); //인터페이스니까 public, static 은 뗄 수 있음
}

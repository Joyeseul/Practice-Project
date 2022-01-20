package com.ysjo.section01;

public class MyMathTest2 {
    public static void main(String[] args) {

        /* 1. 클래스 메서드 호출. 인스턴스 생성없이 호출할 수 있다 */
        System.out.println(MyMath2.add(200L, 100L));
        System.out.println(MyMath2.divide(200L, 100L));

        /* 인스턴스 생성 */
        MyMath2 mm = new MyMath2();
        mm.a = 200L;
        mm.b = 100L;

        /* 2. 인스턴스 메서드 호출. */
        System.out.println(mm.add());
        System.out.println(mm.divide());

    }
}

class MyMath2 {
    long a;
    long b;

    /* 매개변수만을 이용해서 작업 */
    static long add(long a, long b) { return a + b; } //넘겨받은 지역변수인 a, b를 사용
    static double divide(long a, long b) { return a / b; }
    
    /* 인스턴스 변수 a, b 만을 이용해서 작업. 매개변수가 필요없다 */
    long add() { return a + b; }                    //a, b는 인스턴스 변수
    double divide() { return a / b; }

}

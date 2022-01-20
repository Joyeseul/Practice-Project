package com.ysjo.section01;

public class MyMathTest {

    public static void main(String[] args) { //단축키 psvm

        MyMath mm = new MyMath();

        /* 매개변수와 return 값 복합 활용 */
        long result1 = mm.add(5L, 3L);
        long result2 = mm.subtract(5L, 3L);
        long result3 = mm.multiply(5L, 3L);
        double result4 = mm.devide(5L, 3L); //자동형변환 됨

        System.out.println(result1 + ", " + result2 + ", " + result3 + ", " + result4);

    }
}

class MyMath {
    long add(long a, long b) {
        return a + b;
    }

    long subtract(long a, long b) {
        return a - b;
    }

    long multiply(long a, long b) {
        return a * b;
    }

    long devide(long a, long b) {
        return a / b;
    }

}


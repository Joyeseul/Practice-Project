package com.ysjo.section01;

public class methodTest {

    public static void main(String[] args) {

        int result = methodA(50);

        System.out.println("return 값은 : " + result);

    }

    public static int methodA(int a) {
        return --a;
    }
}

package com.ysjo.section01;

public class BlockTest {
    static {
        System.out.println("클래스 초기화블럭 수행...");
    }

    {
        System.out.println("인스턴스 초기화 블럭 수행...");
    }

    public BlockTest() {
        System.out.println("생성자 수행...");
    }

    public static void main(String[] args) {
        BlockTest bt1 = new BlockTest();
        BlockTest bt2 = new BlockTest();
    }
}

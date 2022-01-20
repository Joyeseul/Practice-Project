package com.ysjo.section01;

public class AcademyTest {
    public static void main(String[] args) {

        Academy ac = new Academy();
        Academy ac2 = new Academy(1, "홍길동");

    }


}

class Academy {
    private int studentNo;
    private String name;

    /* 기본생성자 */
    public Academy() {}

    /* 매개변수 있는 생성자 */
    public Academy(int studentNo, String name) {
        this.name = name;
    }
}

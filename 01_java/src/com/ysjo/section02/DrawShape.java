package com.ysjo.section02;

import java.awt.*;

public class DrawShape {

    public static void main(String[] args) {
        Circle c = new Circle(new Point(150, 150), 50);
        c.draw(); //오버라이드한 Circle클래스의 draw()가 실행됨

    }
}

class Shape {
    String color = "black";

    void draw() { System.out.println(color); }
}

class Point {
    int x;
    int y;

    Point() {
        this(0, 0);
    }
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Circle extends Shape {    //상속관계. 원은 도형이다.
    Point center;               //포함관계. 원은 점을 가지고 있다.
    int r;

    Circle() {
        this(new Point(0, 0), 100); //아래의 Circle(Point center, int r)를 호출
    }
    Circle(Point center, int r) {
        super.color = "yellow";     //부모클래스의 레퍼런스 변수를 사용함
        this.center = center;
        this.r = r;
    }

    void draw() {               //오버라이드
        System.out.println("center = (" + center.x + ", " + center.y
                + "), r = " + r + ", color = " + color);
        System.out.println();
    }
}

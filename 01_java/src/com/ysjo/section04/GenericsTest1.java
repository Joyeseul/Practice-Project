package com.ysjo.section04;

import java.util.ArrayList;

public class GenericsTest1<T> { //제네릭 타입 T를 선언
    private T car;

    public GenericsTest1() {}

    public GenericsTest1(T car) { this.car = car; }

    public T getCar() { return this.car; }          //getter
    public void setCar(T car) { this.car = car; }   //setter

}


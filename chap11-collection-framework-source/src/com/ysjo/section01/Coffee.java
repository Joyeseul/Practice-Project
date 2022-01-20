package com.ysjo.section01;

public class Coffee implements Comparable<Coffee> {
    /* Collection.sort 를 사용하기위해, Coffee 클래스를 Comparable 로 구현함
    * Comparable을 상속하면 compareTo() 메서드를 Override 해야 한다. */

    public Long id;         //번호
    public Integer price;   //가격
    public String name;     //상품명

    public Coffee(){}

    public Coffee(long id, int price, String name) {
        this.id = id;
        this.price = price;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%s:%d:%d", name, id, price);
    }

    @Override
    public int compareTo(Coffee o) {
        //리턴값으로 Coffee 객체의 id를 비교함
        return id.compareTo(o.id);
    }

}

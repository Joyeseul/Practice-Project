package com.ysjo.section02;

public class PolyArgumentTest {
    public static void main(String[] args) {
        Buyer b = new Buyer();

        /* 매개변수의 다형성 */
        TV tv1 = new TV();
        Computer com1 = new Computer();

        b.buy(tv1);
        b.buy(com1);

        System.out.println("현재 남은돈 : " + b.money + ", 현재 보너스포인트 : " + b.bonusPoint);
    }
}

class Product {                 //TV와 Computer의 부모클래스
    int price;                  //가격
    int bonusPoint;             //보너스포인트

    Product() {}
    Product(int price) {
        this.price = price;
        bonusPoint = (int)(price/10.0);     //보너스점수는 제품가의 10%
    }
}

class TV extends Product {
    /* 부모클래스의 Product(int price)메소드를 호출함 */
    TV() { super(100); }
    /* toString() 오버라이드 */
    public String toString(){ return "TV"; }
}

class Computer extends Product {
    Computer() { super(200);} 
    public String toString(){ return "Computer"; }
}

class Buyer {                       //고객
    int money = 1000;               //시작 소유금액
    int bonusPoint = 0;             //보너스포인트

    void buy(Product p) {
        if(money < p.price) {
            System.out.println("잔액부족!");
            return;
        }

        money -= p.price;                       //가진 돈에서 가격을 뺀다
        bonusPoint += p.bonusPoint;             //제품의 보너스포인트를 더한다
        System.out.println(p + "을/를 구매하셨습니다.");     //오버라이드 해두었으므로 제품명 출력
    }

}

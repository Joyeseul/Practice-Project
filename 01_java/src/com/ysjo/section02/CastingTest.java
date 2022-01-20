package com.ysjo.section02;

public class CastingTest {
    public static void main(String[] args) {
        /*
        Car car = null;

        FireEngine fe = new FireEngine();
        fe.water();

        car = fe;                   //car = (Car)fe; 였음. 묵시적 형번환.
        //car.water();              //컴파일에러. 타입이 Car이므로 사용불가

        FireEngine fe2 = null;
        fe2 = (FireEngine) car;     //명시적 형변환. 다운 캐스팅(하위타입으로 형변환)
        fe2.water();                //사용가능
        */

        FireEngine fe = new FireEngine();

        if(fe instanceof FireEngine) {
            System.out.println("소방차의 instance 입니다");
        }
        if(fe instanceof Car) {
            System.out.println("자동차의 instance 입니다.");
        }
        if(fe instanceof Object) {
            System.out.println("Object의 instance 입니다.");
        }
        System.out.println(fe.getClass().getName());


    }

}
class Car {                         //부모클래스
    String color; //색
    int door;

    void drive() { System.out.println("운전중..."); }

    void stop() { System.out.println("stop!"); }
}

class FireEngine extends Car {      //자녀클래스
    void water() { System.out.println("물을 뿌립니다"); }
}

package com.ysjo.section04;

public class Application {
    public static void main(String[] args) {

        /* 타입의 T 대신, 실제 타입을 지정하여 객체 생성 */
        GenericsTest1<Integer> gt1 = new GenericsTest1<>();
        gt1.setCar(101);
        //gt1.setCar("sonata");  //에러. Integer 이외의 타입은 지정 불가

        /* 가져올때도 형변환이 필요없음 */
        System.out.println(gt1.getCar());
        System.out.println(gt1.getCar() instanceof Integer);

        GenericsTest1<String> gt4 = new GenericsTest1<>();
        gt4.setCar("BMW");

        System.out.println(gt4.getCar());
        System.out.println(gt4.getCar() instanceof String);

    }


}

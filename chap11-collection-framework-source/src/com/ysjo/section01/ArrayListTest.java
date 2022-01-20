package com.ysjo.section01;

import java.util.*;

public class ArrayListTest {
    public static void main(String[] args) {

        /* 값을 비교할 Coffee 객체들을 생성하고 List 에 담아준다. */
        List<Coffee> coffeeList = new ArrayList<>();

        coffeeList.add(new Coffee(33L, 1200, "모카"));
        coffeeList.add(new Coffee(24L, 1100, "라떼"));
        coffeeList.add(new Coffee(27L, 900, "아메리카노"));
        coffeeList.add(new Coffee(23L, 1300, "차이티라떼"));

        /* 기본 id 필드 기준 정렬 */
        Collections.sort(coffeeList);
        System.out.println(coffeeList);

        /* name 기준 정렬 */
        Collections.sort(coffeeList, new Comparator<Coffee>() {
            @Override
            public int compare(Coffee o1, Coffee o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        System.out.println(coffeeList);

        /* price 기준 정렬(람다식) */
        coffeeList.sort((Comparator.comparing(o -> o.price)));
        System.out.println(coffeeList);

    }


}


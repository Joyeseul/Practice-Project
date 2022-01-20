package com.ysjo.section01;

import java.util.ArrayList;
import java.util.List;

public class Lamda03 {
    public static void main(String[] args) {
        /* 메소드 참조 : 람다 표현식이 단 하나의 메소드만을 호출하는 경우,
        *           해당 람다식에서 불필요한 매개변수를 제거하고 사용할 수 있게 함 */

        List<String> names = new ArrayList<>();
        names.add("김골퍼");
        names.add("이골퍼");
        names.add("최골퍼");
        names.add("조골퍼");

        /* 반복문 사용 */
        for(int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        System.out.println();

        /* forEach() : int i와 같은 변수 선언도 필요없이, 바로 데이터 확인 가능 */
        names.forEach(d -> System.out.println(d));
        System.out.println();

        /* forEach() 안쪽에서 메소드 참조 사용 */
        names.forEach(System.out::println);
        System.out.println();
    }
}

package com.ysjo.section04;

public class EnumTest {

    public static void main(String[] args) {
        /* 값을 가져올 수 있다. */
        System.out.println(Map.Direction.EAST.getValue());

        /* == 사용 가능하다. 단, 비교연산자 <, >는 사용할 수 없다. */
        System.out.println(Map.Direction.EAST == Map.Direction.NORTH);

        /* compareTo()는 사용가능하다. (다를 시 -1 반환) */
        System.out.println(Map.Direction.EAST.compareTo(Map.Direction.SOUTH));
    }

    static class Map{
        /* 열거형 상수값이 연속적이라면, 괄호{}안에 상수의 이름을 나열하기만 하면 된다 */
        //enum Direction { EAST, SOUTH, WEST, NORTH }

        /* 열거형 상수가 불연속적인 값이라면, 원하는 값을 괄호 안에 적는다 */
        enum Direction{ EAST(1), SOUTH(5), WEST(-1), NORTH(10);

            private final int value;                        //저장할 필드
            Direction(int value) { this.value = value; }    //생성자
            public int getValue() { return value; }         //getter
        }
    }

    static class card{
        final Kind kind; //타입이 int가 아니라 Kind이다.
        final Value value;

        card(Kind kind, Value value) {
            this.kind = kind;
            this.value = value;
        }

        enum Kind {CLOVER, HEART, DIAMOND, SPADE} //열거형의 kind를 정의
        enum Value {TWO, THREE, FOUR} //열거형의 value를 정의
    }
}

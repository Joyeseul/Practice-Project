package com.ysjo.section02;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest04 {

    public static void main(String[] args) {

        /* 스트림의 최종 연산 */
        //http://www.tcpschool.com/java/java_stream_terminal

        /* forEach() : 스트림의 각 요소를 소모하여 명시된 동작을 수행함.
        * 반환타입이 void 이므로 보통 스트림의 모든 요소를 출력하는 용도로 사용 */
        Stream<String> stream1 = Stream.of("넷", "둘", "셋", "하나");
        stream1.forEach(System.out::println);

        /* reduce() : 첫 번째와 두 번째 요소를 가지고 연산을 수행한 뒤, 그 결과와 세 번째 요소를 가지고 또다시 연산을 수행함.
        * 이런 식으로 해당 스트림의 모든 요소를 소모하여 연산을 수행하고, 그 결과를 반환한다. */
        Stream<String> stream2 = Stream.of("넷", "둘", "셋", "하나");
        Stream<String> stream3 = Stream.of("넷", "둘", "셋", "하나");

        Optional<String> result1 = stream2.reduce((s1, s2) -> s1 + "++" + s2);
        result1.ifPresent(System.out::println);

        /* findFirst()와 findAny() : 해당 스트림에서 첫 번째 요소를 참조하는 Optional 객체를 반환 */
        IntStream stream4 = IntStream.of(4, 2, 7, 3, 5, 1, 6);
        OptionalInt result2 = stream4.sorted().findFirst();
        System.out.println(result2.getAsInt());
    }

}

package com.ysjo.section02;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest02 {
    public static void main(String[] args) {

        /* 스트림의 생성 */

        /* 배열을 받아서 스트림 생성 */
        String[] arr = new String[]{"넷", "둘", "셋", "하나"};

        Stream<String> stream1 = Arrays.stream(arr);
        stream1.forEach(e -> System.out.println(e + ""));   //람다
        System.out.println();

        /* 배열의 특정한 부분만 이용해서 스트림 생성 */
        Stream<String> stream2 = Arrays.stream(arr, 1, 3);
        stream2.forEach(e -> System.out.println(e + ""));   //람다
        System.out.println();

        Stream<Double> stream3 = Stream.of(4.2, 2.5, 3.1, 1.9);
        stream3.forEach(System.out::println);               //메소드 참조
        System.out.println();

        /* 지정된 범위의 연속된 정수 */
        /* range() : 명시된 시작 정수 포함. 마지막 정수는 포함 x */
        IntStream stream4 = IntStream.range(1, 4);
        stream4.forEach(e -> System.out.println(e + ""));
        System.out.println();

        /* rangeClosed() : 명시된 시작 정수뿐만 아니라 명시된 마지막 정수까지도 포함 */
        IntStream stream5 = IntStream.rangeClosed(1, 4);
        stream5.forEach(e -> System.out.println(e + ""));
        System.out.println();

        /* 특정 타입의 난수들 */
        IntStream stream6 = new Random().ints(4);
        stream6.forEach(System.out::println);
        System.out.println();

        /* 람다 표현식
        * iterate() : 시드(seed)로 명시된 값을 람다 표현식에 사용하여, 반환된 값을 다시 시드로 사용하는 방식으로 무한 스트림을 생성
        * generate() : 매개변수 없는 람다표현식을 사용하여, 반환된 값으로 무한 스트림 생성 */
        IntStream stream7 = IntStream.iterate(2, n -> n + 2);   //2, 4, 6, 8, ..
        Stream stream8 = Stream.generate(() -> "무한").limit(5);      //.limit()으로 갯수 제한 가능
        stream8.forEach(e -> System.out.println(e + ""));

        /* 파일
        * 데이터를 행 단위로 불러오기. path 만 입력하면 될듯 */
        //Stream<String> stream9 = Files.lines(Path path);

        /* 빈 스트림 */
        Stream<Object> stream = Stream.empty();
        System.out.println("스트림 요소 갯수 : " + stream.count()); // 스트림의 요소의 총 개수를 출력함.
    }
}

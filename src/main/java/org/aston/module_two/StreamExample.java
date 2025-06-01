package org.aston.module_two;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {
        List<List<Integer>> list = List.of(List.of(5,3,2),List.of(4,1,5));

        System.out.println(Stream.of(list)
                .flatMap(Collection::stream)
                .collect(Collectors.toMap(i -> i,i -> 1, (v1, v2) -> v1 + 1)));

        list.stream().peek(integer -> System.out.println("Peek : " + integer))
                .forEach(integer -> System.out.println("For each : " + integer));

        List<Integer> integerList = List.of(1,2,3,4,5,6);

        integerList.stream().peek(integer -> System.out.println("Peek : " + integer))
                .distinct()
                .forEach(integer -> System.out.println("For each : " + integer));
    }
}

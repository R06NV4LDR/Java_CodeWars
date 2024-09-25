package Fundamentals._02_ListFiltering;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

//In this kata you will create a function that takes a list of non-negative integers and strings and returns a new list with the strings filtered out.
//Example
//
//Kata.filterList(List.of(1, 2, "a", "b")) => List.of(1,2)
//Kata.filterList(List.of(1, "a", "b", 0, 15)) => List.of(1,0,15)
//Kata.filterList(List.of(1, 2, "a", "b", "aasf", "1", "123", 123)) => List.of(1, 2, 123)
//
//List

public class ListFiltering {
    public static List<Object> filterList(final List<Object> list) {
        return list.stream()
                .filter(element -> element instanceof Integer)
                .collect(Collectors.toList());
    }
}


/*
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExampleTests {

    @Test
    public void examples() {
        assertEquals(List.of(1, 2), Kata.filterList(List.of(1, 2, "a", "b")), "For input: [1, 2, \"a\", \"b\"]");
        assertEquals(List.of(1, 0, 15), Kata.filterList(List.of(1, "a", "b", 0, 15)), "For input: [1, \"a\", \"b\", 0, 15]");
        assertEquals(List.of(1, 2, 123), Kata.filterList(List.of(1, 2, "aasf", "1", "123", 123)), "For input: [1, 2, \"aasf\", \"1\", \"123\", 123]");
    }
}*/

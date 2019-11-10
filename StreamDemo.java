package Wyklad5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        List<String> numbers = Arrays.asList("1","2","3","4","5","6");
        List<Integer> even = numbers.stream()
                             .map(s -> Integer.parseInt(s))
                             .filter(number -> number % 2 == 0)
                             .collect(Collectors.toList());
        // even - kolejne etapy filtrowania liczb parzystych
        System.out.println(even);
        //to jest programowanie funkcyjne, nie zmieniamy stanu naszej listy numbers
    }
}


package com.besant.collection;
import java.util.*;
import java.util.stream.*;

public class StreamExample{

    public static void main(String[] args) {

        // Creating list with values 1 to 20 and some duplicates
        List<Integer> list = new ArrayList<>();
        
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        list.add(17);
        list.add(18);
        list.add(19);
        list.add(20);

        // Adding duplicate values
        list.add(10);
        list.add(15);
        list.add(20);

        System.out.println("Original List: " + list);

        // filter: it filters the data based on condition
        List<Integer> evenNumbers = list.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even Numbers: " + evenNumbers);

        // map: it transforms each element
        List<Integer> squares = list.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println("Squares: " + squares);

        // sorted: it sorts the data
        List<Integer> sortedList = list.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Sorted List: " + sortedList);

        // distinct: it removes duplicates
        List<Integer> distinctList = list.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Distinct List: " + distinctList);

        // limit: it limits the number of elements
        List<Integer> top5 = list.stream()
                .limit(5)
                .collect(Collectors.toList());
        System.out.println("First 5 elements: " + top5);

        // skip: it skips the first n elements
        List<Integer> skip5 = list.stream()
                .skip(5)
                .collect(Collectors.toList());
        System.out.println("Skip first 5: " + skip5);

        // forEach: it processes each element one by one
        System.out.print("Using forEach: ");
        list.stream().forEach(n -> System.out.print(n + " "));
        System.out.println();

        // count: it counts the number of elements
        long count = list.stream().count();
        System.out.println("Count: " + count);

        // anyMatch: it checks if any element matches condition
        boolean anyEven = list.stream().anyMatch(n -> n % 2 == 0);
        System.out.println("Any even number? " + anyEven);

        // allMatch: it checks if all elements match condition
        boolean allPositive = list.stream().allMatch(n -> n > 0);
        System.out.println("All positive? " + allPositive);

        // noneMatch: it checks if no element matches condition
        boolean noneNegative = list.stream().noneMatch(n -> n < 0);
        System.out.println("No negative numbers? " + noneNegative);

        // reduce: it reduces stream to a single value
        int sum = list.stream().reduce(0, (a, b) -> a + b);
        System.out.println("Sum using reduce: " + sum);

        // collect: it collects stream result
        Set<Integer> mySet = list.stream().collect(Collectors.toSet());
        System.out.println("Collected to Set: " + mySet);
    }
}

package com.java.util.stream;

import com.java.Animal;
import com.java.Calculator;
import com.java.Employee;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.logging.SimpleFormatter;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsMain {
    
    public static void main(String[] args) {
//
//        List<Integer>  list = Arrays.asList(1,2,3,4,5,69,10, 30, 50 ,100, 90, 51, 89, 99, 101, 92, 93, 92);
//
//      long count =   list.stream().count();
//
//        long evenNumberCounts =  list.stream().filter(i -> i%2 == 0).count();
//        System.out.println("Total Counts : " + count + " , Even Numbers : " + evenNumberCounts);
//
//        Set<Integer> evenNumbers =  list.stream().filter(i -> i%2 == 0).collect(Collectors.toSet());
//        System.out.println(evenNumbers);

//        Calculator c  = (a,  b) ->   a+b;
//
//        int value = c.calculate(10, 20);
//        System.out.println(value);
//
//        Calculator subExample = (a,b) -> a-b;
//        int subValue = subExample.calculate(10, 20);
//        System.out.println(subValue);
//
//        Animal dog = () -> System.out.println("Bow bow"); // this one child implmentation
//        dog.sound();
//
//        Animal lion = () -> System.out.println("Roar");  // this another child implmentation
//        lion.sound();


//        Predicate<String> test = (v) -> Integer.parseInt(v) % 2 == 0;
//        System.out.println(test.test("10"));;
//
//        Function<Date, String> myFunction = (date) -> {
//
//            SimpleDateFormat sdf = new SimpleDateFormat("MMM");
//            return sdf.format(date);
//
//        };
//        System.out.println(myFunction.apply(new Date()));;
//
//        Consumer<String> consumer = (value) -> System.out.println(value);
//        consumer.accept("Ramesh");
//
//        Supplier<Integer> supplier = () -> 10;
//        supplier.get();



        List<Integer> list =Arrays.asList(1,1,2,2,3,4,8,10, 3,4,5,6,7,8,9,10);
//        List<Integer> outputData = new ArrayList<>();

        //before streams :
//        for (int v:list) {
//            if(v %2 == 0) {
//                v = v+2;
//                if(v > 5) {
//                    outputData.add(v);
//                }
//
//            }
//        }
//        System.out.println(outputData);


//        Streams//
        List<Integer> outputData =   list.stream()
                    .filter(v -> v %2 == 0)
                .skip(2)
                    .distinct()

                    .unordered()


//                    .peek(v -> System.out.println(v))
                    .collect(Collectors.toList());

        System.out.println(outputData);




    }
}

package src.m9_lambdas_streams_functions.webinar.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamsExample<T> {
    public static void main(String[] args) {
        List<String> stringCollection = new ArrayList<>();
        stringCollection.add("ddd2");
        stringCollection.add("aaa2");
        stringCollection.add("bbb1");
        stringCollection.add("bbb3");
        stringCollection.add("ccc");
        stringCollection.add("bbb2");
        stringCollection.add("ddd1");
        stringCollection.add("aaa1");


        //stream creation
        stringCollection.stream()
                //.map(n -> n.toUpperCase())
                .map(String::toUpperCase)
                .sorted((a, b) -> b.compareTo(a))
                .filter(s -> s.length() == 4)
                //.allMatch(p -> p.equals("aaa1"))
                //.noneMatch()
                //.anyMatch(p -> p.equals("aaa1"));
                .forEach(System.out::println);


        //paraller stream creation
        stringCollection.parallelStream();


        /*stringCollection.stream()
                //.map(n -> n.toUpperCase())
                //.sorted()
                .filter(s -> s.startsWith("p"));
                //.forEach(n -> System.out.println(n));*/


        //anyMatch((s) -> s.startsWith("a")
        //count

    }




}

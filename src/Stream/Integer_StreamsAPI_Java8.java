package Stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Integer_StreamsAPI_Java8 {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(10,20,1584,4852,014,13,3,4,10,1,4,45,8,96);

        // get all the even numbers from list

        List<Integer> result = intList.stream()
                .filter(n->n%2==0)
                .collect(Collectors.toList());

        System.out.println("even number :"+result);

        // Numbers starting with 1

        List<Integer> result2 = intList.stream()
                .map(String::valueOf)
                .filter(n->n.startsWith("1"))
                .map(Integer::valueOf)
                .collect(Collectors.toList());

        System.out.println("Starting with 1: "+result2);

        //Duplicate Numbers
        Set<Integer> dup = new HashSet<>();
        List<Integer> result3 = intList.stream()
                .filter(n-> !dup.add(n))
                .collect(Collectors.toList());

        System.out.println("Duplicates :" +result3);

        //Duplicates Using Map

        List<Integer> result4 = intList.stream()
                .collect(Collectors.toMap(n->n,n->1,Integer::sum))
                .entrySet()
                .stream()
                .filter(entry->entry.getValue()>1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println("Duplicates using Map : "+result4);

        //Duplicates using Grouping By

        List<Integer> result5 = intList.stream()
                .collect(Collectors.groupingBy(n->n,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry->entry.getValue()>1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println("Duplicate using grouping By : "+result5);


        // Count the Words and return Map

        List<String> list1= Arrays.asList("apple","banana","apple","Orange");
        Map<String,Long> result6 = list1.stream()
                .collect(Collectors.groupingBy(c->c,TreeMap::new,Collectors.counting()));
        System.out.println(result6);


        Map<String,Long> result7 = list1.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry->entry.getValue()>1)
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        System.out.println("Duplicate with count greater than 1 :"+result7);




    }









}

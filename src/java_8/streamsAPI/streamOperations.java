package java_8.streamsAPI;

import java.util.ArrayList;
import java.util.stream.Stream;

public class streamOperations {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Adam");
        names.add("Jim");
        names.add("Jenny");

        Stream<String> namesStream = names.stream();

        namesStream.forEach(System.out::println);

    }

}

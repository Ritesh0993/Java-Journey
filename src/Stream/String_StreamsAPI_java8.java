package Stream;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class String_StreamsAPI_java8 {

    public static void main(String[] args) {

        //First non Repeating Char os a String
       String str = "SWISS";

       Character nonRepeatingChar = Arrays.stream(str.split(""))
               .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
               .entrySet()
               .stream()
               .filter(entry->entry.getValue()==1)
               .map(Map.Entry::getKey)
               .map(c->c.charAt(0))
               .findFirst()
               .orElse(null);

        System.out.println("First Non Repeating Char of String : "+nonRepeatingChar);



    }

}

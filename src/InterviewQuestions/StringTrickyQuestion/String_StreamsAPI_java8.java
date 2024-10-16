package InterviewQuestions.StringTrickyQuestion;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class String_StreamsAPI_java8 {

    public static void main(String[] args) {

        //First non Repeating Char of a String
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

        /**
         *  Reverse each word of the list of strings
         */

        List<String> inputList = List.of("The quick brown fox jumps over the lazy dog");

        String result= inputList.stream()
                .map(word->new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));

        System.out.println(result);




    }

}

package InterviewQuestions.StringTrickyQuestion;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class String_StreamsAPI_java8 {

    public static void main(String[] args) {

        //First non Repeating Char of a String
       String str = "SWISS";

         Map<String,Long> result = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println("Letter count of String : "+result);


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

        String result2 = inputList.stream()
                .map(word->new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));

        System.out.println(result2);


        /**
         * Find the index of vowels present in the string
         */
        String input = "Ritesh patil";

        List<Integer> vowelIndices = IntStream.range(0, input.length())  // Generate range of indices
                .filter(i -> "AEIOUaeiou".indexOf(input.charAt(i)) != -1) // Check if character at index i is a vowel
                .boxed()                                                 // Convert int to Integer
                .collect(Collectors.toList());                           // Collect indices in a list

        System.out.println("Vowel indices: " + vowelIndices);

        /**
         *  Check is given string is anagram or not
         */

        String s1= "Listen";
        String s2 = "Silent";

        boolean output;

        if(s1 == null || s2 == null || s1.length()!=s2.length()){
         output = false;
        }else{
            output = Arrays.equals(s1.toLowerCase().chars().sorted().toArray(),s2.toLowerCase().chars().sorted().toArray());
        }
        System.out.println("String Anagram Result : "+output);


        Integer s3= 123456;
        Integer s4 = 123456;

        boolean integerAnagram;

        if(s3 == null || s4 == null || s1.length()!=s2.length()){
            integerAnagram = false;
        }else{
            integerAnagram = Arrays.equals(s3.toString().toLowerCase().chars().sorted().toArray(),s4.toString().toLowerCase().chars().sorted().toArray());
        }
        System.out.println("Integer Anagram Result : "+integerAnagram);
    }
}

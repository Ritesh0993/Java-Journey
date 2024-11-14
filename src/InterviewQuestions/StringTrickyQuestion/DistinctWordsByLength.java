package InterviewQuestions.StringTrickyQuestion;

import java.util.*;
import java.util.stream.Collectors;

public class DistinctWordsByLength {

    public static void main(String[] args) {

        /*---------------------With java 8---------------------------------*/
        String[] sentencesInput = {
                "The quick brown fox jumps over the lazy dog dog",
                "Java is a popular programming language",
                "Streams and lambdas make code concise"
        };

        Map<String, Long> wordCount = Arrays.stream(sentencesInput)
                .flatMap(sentence -> Arrays.stream(sentence.split("\\s")))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

        System.out.println(wordCount);

        /*---------------------Classic Approach---------------------------------*/

        String[] sentences = {
                "The quick brown fox jumps over the lazy dog dog",
                "Java is a popular programming language",
                "Streams and lambdas make code concise"
        };


        Map<String, Long> wordCountMap = new HashMap<>();
        Set<String> distinctWords = new HashSet<>();

        for (String sentence : sentences) {

            String[] words = sentence.split("\\s");
            for (String word : words) {
                word = word.toLowerCase();
                if (!distinctWords.contains(word)) {
                    distinctWords.add(word);
                    wordCountMap.put(word, 1L);
                } else {
                    wordCountMap.put(word, wordCountMap.get(word) + 1);
                }
            }
        }

        for (Map.Entry<String, Long> entry : wordCountMap.entrySet()) {
            String word = entry.getKey();
            Long count = entry.getValue();
           // System.out.println("Word: " + word + ", Length: " + word.length() + ", Count: " + count);
        }
    }

}

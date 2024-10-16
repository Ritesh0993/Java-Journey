package InterviewQuestions.StringTrickyQuestion;

import java.util.List;
import java.util.Optional;

public class LongestPalindromicSubstringFromListOfStrings {

    //Leetcode : 405

    /**
     * String palindrome Check
     *
     * @param s
     * @return
     */

    private static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) {
                return false;
            }
        }
        return true;
    }

    /**
     * find the longest panlindrome substring
     *
     * @param
     */

    private static Optional<String> findLongestPalindrome(String s) {
        String longest = "";

        for (int i = 0; i < s.length(); i++) {

            for (int j = i; j < s.length(); j++) {
                String substring = s.substring(i, j + 1);
               // System.out.println(substring);

                if (isPalindrome(substring) && substring.length() > longest.length()) {
                    longest = substring;
                }
            }

        }

        return longest.isEmpty() ? Optional.empty() : Optional.of(longest);

    }


    public static void main(String[] args) {

        List<String> stringList = List.of("racecar", "madam", "hello", "level");

        String ip = "babad";
        Optional<String> result = findLongestPalindrome(ip);
        System.out.println("longest substring of string : " + result.get());

        String longestPalindrome = "";

        for(String input:stringList){
            String currentPalindrome = String.valueOf(findLongestPalindrome(input));

            if(currentPalindrome.length()> longestPalindrome.length()){
                longestPalindrome = currentPalindrome;
            }

        }

        System.out.println("Longest Palindromic Substring is : " + longestPalindrome);

        /*   Optional<String> longestPalindrome = stringList.stream()
                .flatMap(s -> findLongestPalindrome(s).stream())
                .reduce((s1, s2) -> s1.length() > s2.length() ? s1 : s2);   */


    }
}

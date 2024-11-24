package InterviewQuestions.StringTrickyQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StockPriceDays {

    public static List<List<Integer>> findIncreasingSubarrays(List<Integer> stockPrices) {
        List<List<Integer>> result = new ArrayList<>();
        int start = 0;

        for (int i = 1; i <= stockPrices.size(); i++) {
            if (i == stockPrices.size() || stockPrices.get(i) <= stockPrices.get(i - 1)) {
                if (i - start > 1) {
                    result.add(stockPrices.subList(start, i));
                }
                start = i;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> stockPrices = Arrays.asList(1, 2, 3, 4, 5, 6, 2, 6, 5, 1, 2, 3, 5);

        List<List<Integer>> subarrays = findIncreasingSubarrays(stockPrices);
        System.out.println("Increasing subarrays:");
        for (List<Integer> subarray : subarrays) {
            System.out.println(subarray);
        }
    }
}

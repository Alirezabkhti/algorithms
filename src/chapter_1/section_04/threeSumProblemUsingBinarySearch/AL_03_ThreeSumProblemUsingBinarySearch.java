package chapter_1.section_04.threeSumProblemUsingBinarySearch;

import java.util.Arrays;

public class AL_03_ThreeSumProblemUsingBinarySearch {
    public static void main(String[] args) {
        int[] numbers = {30, -40, -20, -10, 40, 0, 10, 5};
        Arrays.sort(numbers);
        ThreeSumProblemUsingBinarySearch threeSumProblemUsingBinarySearch =
                new ThreeSumProblemUsingBinarySearch(numbers);
        System.out.println(threeSumProblemUsingBinarySearch.calculateTriplesSum());
    }
}

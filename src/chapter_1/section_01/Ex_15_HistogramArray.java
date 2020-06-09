package chapter_1.section_01;

public class Ex_15_HistogramArray {
    public static void main(String[] args) {
        int[] initialArray = {1,9,3,4,1,5,3,4};

        int[] occurrences = calculateNumberOfOccurrence(initialArray,9);

        for(int i = 0; i < occurrences.length; i++) {
            System.out.println(occurrences[i]);
        }
    }

    private static int[] calculateNumberOfOccurrence(int[] initialArray, int occurrenceArrayLength) {
        int[] occurrences = new int[occurrenceArrayLength];

        for(int i = 0; i < initialArray.length; i++) {
           if(initialArray[i] < occurrenceArrayLength) {
               occurrences[initialArray[i]]++;
           }
        }
        return  occurrences;
    }
}

package chapter_2.section_02.quickSort;

import java.util.Arrays;
import java.util.Random;

class QuickSort {

    static void sort(int[] unsortedArray) {
        shuffle(unsortedArray);
        quickSort(unsortedArray, 0, unsortedArray.length - 1);
    }

    private static int[] shuffle(int[] unsorted) {
        int arrayLength = unsorted.length;
        for (int i = 0; i < arrayLength; i++) {
            int randomIndex = new Random().nextInt(i + 1);
            int temp = unsorted[i];
            unsorted[i] = unsorted[randomIndex];
            unsorted[randomIndex] = temp;
        }

        return unsorted;
    }

    private static void quickSort(int[] unsortedArray, int lowIndex, int highIndex) {
        if (lowIndex >= highIndex) return;
        int partitionedIndex = partition(unsortedArray, lowIndex, highIndex);
        quickSort(unsortedArray, lowIndex, partitionedIndex);
        quickSort(unsortedArray, partitionedIndex + 1, highIndex);
    }

    private static int partition(int[] unsortedArray, int lowIndex, int highIndex) {
        int i = lowIndex;
        int j = highIndex + 1;

        while (true) {
            while (unsortedArray[++i] <= unsortedArray[lowIndex])
                if (i == highIndex) break;

            while (unsortedArray[lowIndex] <= unsortedArray[--j] )
                if (j == lowIndex) break;

            if (i >= j) break;

            int temp = unsortedArray[j];
            unsortedArray[j] = unsortedArray[i];
            unsortedArray[i] = temp;

        }

        int temp = unsortedArray[j];
        unsortedArray[j] = unsortedArray[lowIndex];
        unsortedArray[lowIndex] = temp;

        return j;
    }
}

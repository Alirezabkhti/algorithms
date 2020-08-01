package chapter_2.section_02.quickSelect;

import java.util.Random;

public class QuickSelect {

    static int select(int[] array, int k) {
        shuffle(array);
        int lowIndex = 0;
        int highIndex = array.length - 1;

        while (lowIndex < highIndex) {
            int j = partition(array, lowIndex, highIndex);
            if (j < k)
                lowIndex = j + 1;
            else if (j > k)
                highIndex = j - 1;
            else
                return array[k];
        }
        return array[k];
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

    private static int partition(int[] unsortedArray, int lowIndex, int highIndex) {
        int i = lowIndex;
        int j = highIndex + 1;

        while (true) {
            while (unsortedArray[++i] <= unsortedArray[lowIndex])
                if (i == highIndex) break;

            while (unsortedArray[lowIndex] <= unsortedArray[--j])
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

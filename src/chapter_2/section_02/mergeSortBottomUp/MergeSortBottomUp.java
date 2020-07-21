package chapter_2.section_02.mergeSortBottomUp;

public class MergeSortBottomUp {
    static int[] auxiliaryArray;
    static void sort(int[] unsortedArray) {
        int arrayLength = unsortedArray.length;
        auxiliaryArray = new int[arrayLength];

        for (int subArraySize = 1; subArraySize < arrayLength; subArraySize = 2 * subArraySize) {
            for (int low = 0; low < arrayLength - subArraySize; low += 2 * subArraySize)
                merge(unsortedArray, auxiliaryArray, low, Math.min(low + 2 * subArraySize - 1, arrayLength - 1), low + subArraySize - 1);
        }
    }

    private static int[] merge(int[] unsortedArray, int[] auxiliaryArray, int lowIndex, int highIndex, int middleIndex) {
        /**
         *Initialize auxiliary array outside of recursive sort method is best practice and prevent performance issues
         */
        for (int k = lowIndex; k <= highIndex; k++)
            auxiliaryArray[k] = unsortedArray[k];

        int i = lowIndex;
        int j = middleIndex + 1;

        for (int k = lowIndex; k <= highIndex; k++) {
            if (i > middleIndex)
                unsortedArray[k] = auxiliaryArray[j++];
            else if (j > highIndex)
                unsortedArray[k] = auxiliaryArray[i++];
            else if (auxiliaryArray[i] >= auxiliaryArray[j])
            /**
             *Substitute j++ with i++ for reverse sort
             */
                unsortedArray[k] = auxiliaryArray[j++];
            else
                unsortedArray[k] = auxiliaryArray[i++];
        }
        return unsortedArray;
    }
}

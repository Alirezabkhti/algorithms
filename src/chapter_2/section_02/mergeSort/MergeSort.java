package chapter_2.section_02.mergeSort;

class MergeSort {

    static void sort(int[] unsortedArray) {
        int[] auxiliaryArray = new int[unsortedArray.length];
        sort(unsortedArray, auxiliaryArray, 0, unsortedArray.length - 1);
    }

    private static void sort(int[] unsortedArray, int[] auxiliaryArray, int lowIndex, int highIndex) {
        if (highIndex <= lowIndex) return;
        int middleIndex = lowIndex + (highIndex - lowIndex) / 2;
        sort(unsortedArray, auxiliaryArray, lowIndex, middleIndex);
        sort(unsortedArray, auxiliaryArray, middleIndex + 1, highIndex);
        merge(unsortedArray, auxiliaryArray, lowIndex, highIndex, middleIndex);
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

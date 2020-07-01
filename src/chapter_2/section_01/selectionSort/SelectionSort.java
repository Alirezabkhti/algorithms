package chapter_2.section_01.selectionSort;

class SelectionSort {
    /**
     * No need to keep track of values, just keep indexes
     */
   /* int min = unsortedArray[i];
            int indexOfMin = i;*/
   /*if (min >= unsortedArray[j]) {
                    min = unsortedArray[j];
                    indexOfMin = j;
                }*/
    static int[] sort(int[] unsortedArray) {
        int arrayLength = unsortedArray.length;
        for (int i = 0; i < arrayLength; i++) {
            int min = i;
            for (int j = i + 1; j < arrayLength; j++)
                if (unsortedArray[min] >= unsortedArray[j])
                    min = j;
            int temp = unsortedArray[i];
            unsortedArray[i] = unsortedArray[min];
            unsortedArray[min] = temp;
        }
        return unsortedArray;
    }
}

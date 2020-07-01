package chapter_2.section_01.insertionSort;

class InsertionSort {
    static int[] sort(int[] unsortedArray) {
        int arrayLength = unsortedArray.length;

        for (int i = 0; i < arrayLength; i++) {
            for (int j = i; j >0; j--) {
                if(unsortedArray[j] < unsortedArray[j-1]) {
                    int temp = unsortedArray[j];
                    unsortedArray[j] = unsortedArray[j-1];
                    unsortedArray[j-1] = temp;
                } else
                    break;
            }
        }
        return unsortedArray;
    }
}

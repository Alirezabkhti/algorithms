package chapter_2.section_01.shellSort;

class ShellSort {
    static int[] sort(int[] unsortedArray) {
        int arrayLength = unsortedArray.length;
        //This is h
        int stride = 1;

        while (stride < arrayLength / 3)
            stride = 3 * stride + 1;

        while (stride >= 1) {
            for (int i = stride; i < arrayLength; i++) {
                for (int j = i; j >= stride && (unsortedArray[j] < unsortedArray[j - stride]); j -= stride) {
                    int temp = unsortedArray[j];
                    unsortedArray[j] = unsortedArray[j - stride];
                    unsortedArray[j - stride] = temp;
                }
            }
            stride = stride / 3;
        }

        return unsortedArray;
    }
}

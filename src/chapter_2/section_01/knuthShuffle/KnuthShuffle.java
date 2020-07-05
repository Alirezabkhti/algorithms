package chapter_2.section_01.knuthShuffle;

import java.util.Random;

class KnuthShuffle {
    static int[] shuffle(int[] sortedArray) {
        int arrayLength = sortedArray.length;
        for (int i = 0; i < arrayLength; i++) {
            int randomIndex = new Random().nextInt(i + 1);
            int temp = sortedArray[i];
            sortedArray[i] = sortedArray[randomIndex];
            sortedArray[randomIndex] = temp;
        }

        return sortedArray;
    }
}

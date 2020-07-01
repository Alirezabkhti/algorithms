package chapter_2.section_01.insertionSort;

import java.util.Arrays;

public class AL_02_InsertionSort {
    public static void main(String[] args) {
        int[] unsorted = {2, 3, 1, 4, 7, 4,7,8,8, 9, 0, 5, 6};

        System.out.println("Unsorted values: ");
        Arrays.stream(unsorted).forEach(System.out::println);

        System.out.println("Sorted values: ");
        Arrays.stream(InsertionSort.sort(unsorted)).forEach(System.out::println);
    }
}

package chapter_2.section_02.quickSort;


import java.util.Arrays;

public class AL_04_QuickSort {
    public static void main(String[] args) {
        int[] unsorted = {2, 3, 1, 4, 7, 4,7,8,8, 9, 0, 5, 6};

        System.out.println("Unsorted values: ");
        Arrays.stream(unsorted).forEach(System.out::println);

        System.out.println("Sorted values: ");
        QuickSort.sort(unsorted);
        Arrays.stream(unsorted).forEach(System.out::println);
    }
}

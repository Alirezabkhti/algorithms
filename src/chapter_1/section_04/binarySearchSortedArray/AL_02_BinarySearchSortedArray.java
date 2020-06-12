package chapter_1.section_04.binarySearchSortedArray;

import java.util.Arrays;

public class AL_02_BinarySearchSortedArray {
    public static void main(String[] args) {
        int [] numbers = {45,12,85,32,89,39,69,44,42,1,6,8};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        BinarySearchSortedArray binarySearchSortedArray = new BinarySearchSortedArray();
        System.out.println(binarySearchSortedArray.findIndex(numbers,55));
        System.out.println(
                binarySearchSortedArray.findIndexRecursively(numbers,45,0,numbers.length-1)
        );
    }
}

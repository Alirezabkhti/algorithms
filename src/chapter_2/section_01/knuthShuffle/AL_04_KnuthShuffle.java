package chapter_2.section_01.knuthShuffle;

import java.util.Arrays;

public class AL_04_KnuthShuffle {
    public static void main(String[] args) {
        int[] sorted = {0,1,2,3,4,5,6,7,8,9,10};

        System.out.println("Sorted values: ");
        Arrays.stream(sorted).forEach(System.out::println);

        System.out.println("Shuffled values: ");
        Arrays.stream(KnuthShuffle.shuffle(sorted)).forEach(System.out::println);
    }
}

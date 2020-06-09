package chapter_1.section_01;

import java.util.Scanner;

public class Ex_09_BinaryString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base10Digit = scanner.nextInt();
        String binaryString = "";

        for (int i = base10Digit; i > 0; i /= 2) {
            binaryString = (i % 2) + binaryString;
        }

        System.out.println("Real binary string: " + Integer.toBinaryString(base10Digit));
        System.out.println("My algorithm answer: " + binaryString);
    }
}

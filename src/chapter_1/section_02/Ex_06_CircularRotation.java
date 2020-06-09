package chapter_1.section_02;

import java.util.Scanner;

public class Ex_06_CircularRotation {
    public static void main(String[] args) {
        //ACTGACG
        //TGACGAC

        //NEDTER
        //TERNED

        Scanner scanner = new Scanner(System.in);
        String mainString = scanner.next();
        String circularRotation = scanner.next();
        System.out.println(
                iSCircularRotation(mainString,circularRotation)
        );

    }

    private static boolean iSCircularRotation(String main, String rotation) {
        return main.length() == rotation.length() && (main + main).contains(rotation);
    }
}

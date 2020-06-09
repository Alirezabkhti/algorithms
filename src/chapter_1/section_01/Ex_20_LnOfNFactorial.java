package chapter_1.section_01;

public class Ex_20_LnOfNFactorial {
    public static void main(String[] args) {
        System.out.println(Math.log(calculateFactorial(6)));
    }

    private static long calculateFactorial(int number) {
        if (number <= 1)
            return 1;
        else
            return number * calculateFactorial(number - 1);
    }
}

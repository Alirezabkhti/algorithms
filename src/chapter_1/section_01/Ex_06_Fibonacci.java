package chapter_1.section_01;

public class Ex_06_Fibonacci {
    public static void main(String[] args) {
        int f = 0;
        int g = 1;

        for (int i = 0; i <= 15; i++) {
           System.out.println(f);
            f = f + g;
            g = f - g;
        }
    }
}

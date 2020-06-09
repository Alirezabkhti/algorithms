package chapter_1.section_01;

public class Ex_24_EuclidGreatestCommonDivisor {

    public static void main(String[] args) {
        System.out.println(calculateGreatestCommonDivisor(24, 18));
    }

    private static int calculateGreatestCommonDivisor(int first, int second) {
        if (second == 0)
            return first;
        int r = first % second;
        return calculateGreatestCommonDivisor(second, r);
    }
}

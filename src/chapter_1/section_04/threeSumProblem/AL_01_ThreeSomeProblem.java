package chapter_1.section_04.threeSumProblem;

public class AL_01_ThreeSomeProblem {
    public static void main(String[] args) {
        int[] numbers = {30, -40, -20, -10, 40, 0, 10, 5};
        ThreeSomeProblem threeSomeProblem = new ThreeSomeProblem(numbers);
        System.out.println(threeSomeProblem.calculateTriplesSum());
    }
}

package chapter_1.section_04.threeSumProblem;

class ThreeSomeProblem {
    private int[] numbers;

    ThreeSomeProblem(int[] numbers) {
        this.numbers = numbers;
    }

    int calculateTriplesSum() {
        int count = 0;
        int numbersSize = numbers.length;

        for (int i = 0; i < numbersSize; i++) {
            for (int j = i + 1; j < numbersSize; j++) {
                for (int k = j + 1; k < numbersSize; k++) {
                    if (numbers[i] + numbers[j] + numbers[k] == 0)
                        count++;
                }
            }
        }

        return count;
    }
}

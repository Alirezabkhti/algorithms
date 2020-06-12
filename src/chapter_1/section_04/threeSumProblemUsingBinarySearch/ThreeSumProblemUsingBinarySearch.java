package chapter_1.section_04.threeSumProblemUsingBinarySearch;

class ThreeSumProblemUsingBinarySearch {
    private int[] numbers;

    ThreeSumProblemUsingBinarySearch(int[] numbers) {
        this.numbers = numbers;
    }

    int calculateTriplesSum() {
        int count = 0;
        int numbersSize = numbers.length;

        for (int i = 0; i < numbersSize; i++) {
            for (int j = i + 1; j < numbersSize; j++) {
                int element = -(numbers[i] + numbers[j]);
                boolean binarySearchCondition = binarySearchFindIndex(numbers, element) != -1;
                boolean avoidDoublingCondition = numbers[i] < element && element < numbers[j];
                if (binarySearchCondition && avoidDoublingCondition)
                    count++;
            }
        }

        return count;
    }

    int binarySearchFindIndex(int[] numbers, int element) {
        int low = 0;
        int high = numbers.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (element < numbers[mid])
                high = mid - 1;
            else if (element > numbers[mid])
                low = mid + 1;
            else
                return mid;
        }
        return -1;
    }
}

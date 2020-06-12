package chapter_1.section_04.binarySearchSortedArray;

class BinarySearchSortedArray {
    int findIndex(int[] numbers, int element) {
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

    int findIndexRecursively(int[] numbers, int element, int low, int high) {
        if (low <= high) {
            int mid = low + (high - low) / 2;
            if (element == numbers[mid])
                return mid;
            if (element < numbers[mid])
                return findIndexRecursively(numbers, element, low, mid - 1);
            if (element > numbers[mid])
                return findIndexRecursively(numbers, element, mid + 1, high);
        }
        return -1;
    }
}

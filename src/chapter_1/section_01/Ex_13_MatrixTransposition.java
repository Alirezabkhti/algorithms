package chapter_1.section_01;

public class Ex_13_MatrixTransposition {
    public static void main(String[] args) {
        int numberOfRows = 3;
        int numberOfColumns = 2;

        int[][] mainMatrix = new int[numberOfRows][numberOfColumns];
        mainMatrix[0][0] = 1;
        mainMatrix[0][1] = 2;
        mainMatrix[1][0] = 3;
        mainMatrix[1][1] = 4;
        mainMatrix[2][0] = 5;
        mainMatrix[2][1] = 6;
        System.out.println("Main array: ");
        printArray(mainMatrix);


        int[][] transpositionMatrix = new int[numberOfColumns][numberOfRows];
        for (int i = 0; i < transpositionMatrix.length; i++) {
            for (int j = 0; j < transpositionMatrix[i].length; j++) {
                transpositionMatrix[i][j] = mainMatrix[j][i];
            }
        }
        System.out.println("Transposed array: ");
        printArray(transpositionMatrix);

    }

    private static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}

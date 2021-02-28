package lab6.ch6;

public class Main {

    static void spiralPrint(int rowEnd, int colEnd, int[][] matrix) {
        int i, rowStart = 0, colStart = 0;

        while (rowStart < rowEnd && colStart < colEnd) {
            for (i = colStart; i < colEnd; i++) {
                System.out.print(matrix[rowStart][i] + " ");
            }
            rowStart++;

            for (i = rowStart; i < rowEnd; i++) {
                System.out.print(matrix[i][colEnd - 1] + " ");
            }
            colEnd--;

            if (rowStart < rowEnd) {
                for (i = colEnd - 1; i >= colStart; i--) {
                    System.out.print(matrix[rowEnd - 1][i] + " ");
                }
                rowEnd--;
            }

            if (colStart < colEnd) {
                for (i = rowEnd - 1; i >= rowStart; i--) {
                    System.out.print(matrix[i][colStart] + " ");
                }
                colStart++;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 } };

        spiralPrint(matrix.length, matrix[0].length, matrix);
    }
}

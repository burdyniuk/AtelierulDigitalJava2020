package lab6.ch3;

public class Main {
    public static final int ROWS = 5; // number of rows, change it to change the size of triangle
    
    public static void main(String[] args) {
        // initial data
        int[][] triangle = new int[ROWS][ROWS];
        triangle[0][0] = 1;

        for (int i = 1; i < ROWS; i++) {
            triangle[i][0] = triangle[i-1][i-1];
            for (int j = 1; j <= i; j++) {
                triangle[i][j] = triangle[i-1][j-1] +
                        triangle[i][j-1];
            }
        }
        
        // print
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < ROWS; j++) {
                if (triangle[i][j] != 0) {
                    System.out.print(triangle[i][j] + " ");
                }
            }
            System.out.println();
        }

    }
}

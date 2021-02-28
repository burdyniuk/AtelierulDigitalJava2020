package lab6.ch2;

import static lab6.ch2.PascalsTriangle.fun;

public class Main {
    public static final int ROWS = 5; // number of rows in triangle

    public static void main(String args[]){

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < ROWS - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++){
                System.out.print(" " + fun(i, j));
            }
            System.out.println();
        }
    }
}

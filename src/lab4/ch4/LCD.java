package lab4.ch4;

import java.io.*;
import java.util.Scanner;

public class LCD {

    static char inp[][];
    static char res[][];
    static int n;
    static int r = 5, c = 3;

    public static void main(String[] args) throws IOException {
        File inputFile = new File("./src/lab4/ch4/input.txt");
        BufferedReader br = new BufferedReader(new FileReader(inputFile));
        String input = "";
        String arr[] = {};
        String temp = "";
        n = 1;

        input = br.readLine();
        process(input);
        n = Integer.parseInt(input);
        inp = new char[r][c];
        res = new char[r][c];
    }

    static void process(String s) {
        int a;
        String hold = "";

        for (int i = 0; i < s.length(); i++) {
            a = (int) s.charAt(i);

            switch (a) {
                case '0':
                    hold = "020313010313020";
                    pri(hold);
                    break;
                case '1':
                    hold = "010113010113010";
                    pri(hold);
                    break;
                case '2':
                    hold = "020113020311020";
                    pri(hold);
                    break;
                case '3':
                    hold = "020113020113020";
                    pri(hold);
                    break;
                case '4':
                    hold = "010313020113010";
                    pri(hold);
                    break;
                case '5':
                    hold = "020311020113020";
                    pri(hold);
                    break;
                case '6':
                    hold = "020311020313020";
                    pri(hold);
                    break;
                case '7':
                    hold = "020113010113010";
                    pri(hold);
                    break;
                case '8':
                    hold = "020313020313020";
                    pri(hold);
                    break;
                case '9':
                    hold = "020313020113020";
                    pri(hold);
                    break;
            }
        }
    }

    static void pri(String s) {
        int ind = 0;
        char ch = ' ';
        String res = "";

        for (int i = 0; i < r; i++) {
            res = "";
            for (int j = 0; j < c; j++) {

                if (ind < (16)) {
                    ch = s.charAt(ind);
                }

                if (ch == '1' || ch == '0') {
                    res += " ";
                }

                if (ch == '3' || ch == '4') {
                    res += "|";
                } else if (ch == '2') {
                    res += "-";
                }

                ind = ind + 1;
            }
            System.out.println(res);
        }
    }
}


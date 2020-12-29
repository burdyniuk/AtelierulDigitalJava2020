package lab4.ch5;

import java.io.*;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(new File("./src/lab4/ch5/dummy.txt"));

        // occurrences
        Map<String, Integer> wordCounts = new TreeMap<String, Integer>();
        while (input.hasNext()) {

            String next = input.next().toLowerCase();
            if (!wordCounts.containsKey(next)) {
                wordCounts.put(next, 1);
            } else {
                wordCounts.put(next, wordCounts.get(next) + 1);
            }
        }
        System.out.println(wordCounts);
    }
}

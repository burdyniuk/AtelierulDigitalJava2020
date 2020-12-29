package lab4.ch3;

import java.io.*;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        ArrayList<String> anagrams = new ArrayList<>();
        String test = "listen";

//        String content1 = new String(Files.readAllBytes(Paths.get("./src/lab4/ch3/input1.txt")));
//        String content2 = new String(Files.readAllBytes(Paths.get("./src/lab4/ch3/input2.txt")));
//
//        String contentAll = content1+content2;
//        List<String> words = Arrays.asList(contentAll.split(" "));

        int noPermutations = test.length();
        for(int i = test.length() - 1; i > 0; i--) {
            noPermutations *= i;
        }

        for (int i = 0; i < noPermutations; i++) {

            List<String> letters = Arrays.asList(test.split(""));
            Collections.shuffle(letters);
            StringBuilder builder = new StringBuilder();
            for (String letter : letters) {
                builder.append(letter);
            }

            String addMe = builder.toString();
            // adaug doar cuvintele care nu sunt deja in lista
            if (!anagrams.contains(addMe)) {
                anagrams.add(addMe);
            }
            else {
                i--;
            }
        }

        System.out.println(anagrams);
        try {
            FileWriter output = new FileWriter("./src/lab4/ch3/output.txt");
            output.write(anagrams.toString());
            output.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}

package lab4.ch2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {

        Path file = Path.of("./src/lab4/ch2/input.txt");
        String string = Files.readString(file);
        String message = "";

        for(int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);

            if(Character.isUpperCase(c)) {
                message += c;
            }
        }

        String output = message.replace('X', ' ');
        System.out.println(output);
    }
}

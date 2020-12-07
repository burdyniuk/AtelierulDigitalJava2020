package lab4.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {
    HashMap<String, Long> contact = new HashMap<String, Long>();
    public PhoneBook(String phoneBook) {
        try {
            String name;
            Long number;
            Scanner scanner = new Scanner(new BufferedReader(new FileReader(phoneBook)));
            while (scanner.hasNext()) {
                name = scanner.next();
                if (scanner.hasNextLong()) {
                    number = scanner.nextLong();
                    contact.put(name, number);
                }
            }
        } catch (Exception e) {
            System.out.println("File not found.");
        }
    }

    public Long getByName(String name) {
        return contact.get(name);
    }

    @Override
    public String toString() {
        return contact.toString();
    }
}

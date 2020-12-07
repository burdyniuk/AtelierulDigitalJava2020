package lab4.io;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook("./src/lab4/io/phonebook.txt");
        System.out.println(phoneBook);
        System.out.println("Abbey number: " + phoneBook.getByName("Abbey"));
        System.out.println("Abdul number: " + phoneBook.getByName("Abdul"));
    }
}

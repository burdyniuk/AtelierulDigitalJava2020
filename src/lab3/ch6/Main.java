package lab3.ch6;

public class Main {
    public static void main(String[] args) {
        Person person2 = new Person.Builder()
                             .setDrivingLicense("Has")
                             .setIsMaried(true)
                             .setJob("Engineer")
                             .setName("John")
                             .setUniversity("UPB")
                             .build();
        Person person1 = new Person.Builder()
                             .setDrivingLicense("Has")
                             .setJob("Designer")
                             .setName("Will")
                             .build();
        System.out.println(person2.toString());
        System.out.println(person1.toString());

    }
}

package lab3.ch3;

public class Student {
    String name;
    int money;

    public Student(String name, int money) {
        this.name = name;
        this.money = money;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}

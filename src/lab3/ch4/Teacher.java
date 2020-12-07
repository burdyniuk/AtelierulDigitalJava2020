package lab3.ch4;

import java.util.ArrayList;

public class Teacher {
    ArrayList<Student> students = new ArrayList<Student>();

    public void teach(String topic) {
        if (students != null) {
            for (Student stud : students) {
                System.out.println("Student " + stud.name + " learned about " + topic);
            }
        }
    }
}

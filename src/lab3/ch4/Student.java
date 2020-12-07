package lab3.ch4;

public class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }

    public void listenTo(Teacher teacher) {
        teacher.students.add(this);
    }

}

package tasks.day9.task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Bill", "10");
        Teacher teacher = new Teacher("Mr.Stan","Matematika");

        System.out.println(student.getGroup());
        System.out.println(teacher.getPredmet());

        student.printInfo();
        teacher.printInfo();
    }
}

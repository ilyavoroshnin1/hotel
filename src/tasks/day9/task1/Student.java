package tasks.day9.task1;

import tasks.day9.task1.Human;

public class Student extends Human {

    String group;

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Student(String name, String group) {
        super(name);
        this.group=group;
    }

    @Override
    void printInfo() {
        super.printInfo();
        System.out.println(" Этот студент с именем " + name);
    }
}

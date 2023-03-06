package tasks.day9.task1;

import tasks.day9.task1.Human;

public class Teacher extends Human {

    private String predmet;

    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    public Teacher(String name, String predmet) {
        super(name);
        this.predmet=predmet;
    }

    @Override
    void printInfo() {
        super.printInfo();
        System.out.println(" Этот преподаватель с именем " + name);
    }
}

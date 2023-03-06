package tasks.day9.task1;

public class Human {
    String name;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void printInfo(){
        System.out.println(" Этот человек с именем " + name);
    }
}

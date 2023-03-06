package tasks.day9.task2;

public abstract class Figure {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double area(); // вещественное число - площадь геометрической фигуры

    public abstract double perimeter();
}

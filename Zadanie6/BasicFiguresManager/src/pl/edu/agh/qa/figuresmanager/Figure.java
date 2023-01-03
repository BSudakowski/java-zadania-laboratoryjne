package pl.edu.agh.qa.figuresmanager;

public class Figure {
    private String name;
    private int area;

    public Figure(String name, int area) {
        this.name = name;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public int getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Figure " + name + " with area " + area;
    }
}

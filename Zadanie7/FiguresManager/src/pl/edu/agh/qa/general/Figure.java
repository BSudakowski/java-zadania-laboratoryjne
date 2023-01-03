package pl.edu.agh.qa.general;


public abstract class Figure {
    private int positionX;
    private int positionY;
    protected String name;

    public Figure(int x, int y) {
        this.positionX = x;
        this.positionY = y;
        this.name = "Niezidentyfikowana figura";
    }

    public void move(int x, int y) {
        this.positionX += x;
        this.positionY += y;
    }

    public String position() {
        return "x= " + positionX + ", y=" + positionY;
    }

    public String name() {
        return name;
    }

    public abstract double area();

}

package HackerRank.OOP.Polymorphism.PolymorphismInterface;

public class Rectangle implements Poligono{

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

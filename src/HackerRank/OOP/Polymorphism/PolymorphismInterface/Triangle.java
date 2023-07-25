package HackerRank.OOP.Polymorphism.PolymorphismInterface;

public class Triangle implements Poligono {

    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (base * height) / 2.0;
    }
}

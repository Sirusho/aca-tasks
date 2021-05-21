package week4.day5.shape;

public class Rectangle implements Shape {
    double x;
    double y;

    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double square() {
        return x*y;
    }

    @Override
    public double perimeter() {
        return 2*(x+y);
    }
}

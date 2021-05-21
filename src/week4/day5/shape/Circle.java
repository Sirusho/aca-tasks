package week4.day5.shape;

public class Circle implements Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double square() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public double perimeter() {
        return Math.PI*radius*2;
    }
}

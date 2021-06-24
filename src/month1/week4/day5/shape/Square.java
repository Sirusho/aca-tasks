package month1.week4.day5.shape;
public class Square implements Shape {
    double x;

    public Square(double x) {
        this.x = x;
    }

    @Override
    public double square() {
        return x*x;
    }

    @Override
    public double perimeter() {
        return 4*x;
    }
}

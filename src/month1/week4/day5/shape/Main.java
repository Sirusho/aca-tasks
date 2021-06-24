package month1.week4.day5.shape;

public class Main {
    public static void main(String[] args) {
        System.out.println("Circle");
        Shape shape = new Circle(5);
        System.out.println(shape.square());
        System.out.println(shape.perimeter());
        System.out.println("\nSquare");
        Shape shape1=new Square(10);
        System.out.println(shape1.square());
        System.out.println(shape1.perimeter());
        System.out.println("\nRectangle");
        Shape shape2=new Rectangle(10,15);
        System.out.println(shape2.square());
        System.out.println(shape2.perimeter());
    }
}

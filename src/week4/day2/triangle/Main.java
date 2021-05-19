package week4.day2.triangle;

public class Main {
    public static void main(String[] args) {
        Triangle triangle=new Triangle();
        triangle.setSideA(5);
        triangle.setSideB(3);
        triangle.setSideC(4);
        triangle.check(triangle);
        triangle.isRight(triangle);

    }
}

package month1.week4.day2.triangle;

/*
Write a Triangle class which `
has a sideA, sideB, sideC
write getters and setters for that
     all sides must be in range 1 - 20
define constructor
also your class must have an isTriangleValid() private method.
and also a public check() method which will get as a parameter triangle object and will call isValidTriangle() method.
also add a method which will check if your triangle is right or not.
if the triangle count square else count perimeter.
use method overloading
 */
public class Triangle {
    private int sideA;
    private int sideB;
    private int sideC;

    private void count(int a, int b) {
        System.out.println("Area of triangle is " + (a * b / 2));
    }

    private void count(int a, int b, int c) {
        System.out.println("Perimeter is " + (a + b + c));

    }

    public boolean isRight(Triangle triangle) {
        if (Math.pow(triangle.sideA, 2) == (Math.pow(triangle.sideB, 2) + Math.pow(triangle.sideC, 2))) {
            System.out.println("Triangle is right-angled");
            count(triangle.sideA, triangle.sideB);
            return true;
        } else if (Math.pow(triangle.sideB, 2) == (Math.pow(triangle.sideA, 2) + Math.pow(triangle.sideC, 2))) {
            System.out.println("Triangle is right-angled");
            count(triangle.sideB, triangle.sideC);
            return true;
        } else if (Math.pow(triangle.sideC, 2) == (Math.pow(triangle.sideB, 2) + Math.pow(triangle.sideA, 2))) {
            System.out.println("Triangle is right-angled");
            count(triangle.sideC, triangle.sideB);
            return true;
        }
        count(triangle.sideC, triangle.sideB, triangle.sideA);
        System.out.println("Triangle is not right-angled");
        return false;
    }

    private boolean isTriangleValid(int a, int b, int c) {
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("Triangle is valid");
            return true;
        } else {
            System.out.println("Triangle is not valid");
            return false;
        }
    }

    public boolean check(Triangle triangle) {
        return isTriangleValid(triangle.sideA, triangle.sideB, triangle.sideC);
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }
}

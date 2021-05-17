package Week3.Day2;
/*
Write a square() method, which
if get one  int parameter returns the square of cirqle
if get one float parameter returns the square of square
if get 2 parameters returns the square of rectangle
 */
public class Task6 {
    public static void main(String[] args) {
        int a=5;
        int b=6;
        float f=6.5f;
        square(a);
        square(f);
        square(a, b);

    }
    public static double square(int a){
        return Math.PI*Math.pow(a,2);
    }
    public static float square(float a){
        return a*a;
    }
    public static int square(int a, int b){
        return a*b;
    }
}

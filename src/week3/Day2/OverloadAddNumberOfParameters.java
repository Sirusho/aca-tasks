package Week3.Day2;

public class OverloadAddNumberOfParameters {
    public static void main(String[] args) {
        int a=5, b=6, c=7;
        float f=13.5f;
        add(a,b);
        add(a,b,c);
        add(a,f);
        add(f,a);


    }
    public static void add(int a, int b) {
        System.out.println("method with 2 integers was called -> " + (a+b));
    }
    public static void add(int a, int b, int c) {
        System.out.println("method with 3 integers was called -> " + (a+b+c));
    }
    public static void add(int a, float b) {
        System.out.println("method with integer and float was called -> " + (a+b));
    }
    public static void add(float a, int b) {
        System.out.println("method with integer and float was called -> " + (a+b));
    }


}

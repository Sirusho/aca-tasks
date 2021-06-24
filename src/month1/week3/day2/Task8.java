package month1.week3.day2;
/*
Write a distance() function which
return distance from (0.0 , 0.0) to (a)
distance(int x1 , int x2, int x3, int x4) where (x1, x2) are the coordinates of a
distance(int, int)
return the distance from a to be, if method distance get 4 int parameters
 */
public class Task8 {
    public static void main(String[] args) {
        double x = 3;
        double y = 4;
        double x1 = 6;
        double x2 = 3;
        double y1 = 4;
        double y2 = 7;
        System.out.println("for x and y -> " + calculateDistance(x, y));
        System.out.println("for 2 x and 2 y -> " + calculateDistance(x1, y1, x2, y2));
    }

    public static double calculateDistance(double x, double y){
        return Math.sqrt(x*x+y*y);
    }
    public static double calculateDistance(double x1, double y1, double x2, double y2){
        return Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
    }
}


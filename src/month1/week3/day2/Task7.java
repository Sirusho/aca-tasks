package month1.week3.day2;
/*
max(int a, int b)
max(int a, int b, int c)
max(int a , int b, int c, int d)
 */
public class Task7 {
    public static void main(String[] args) {
        int a=5;
        int b=3;
        int c=6;
        int d=7;
        System.out.println(max(a, b));
        System.out.println(max(a, b, c));
        System.out.println(max(a, b, c, d));
    }
    public static int max(int a, int b){
        if(a>b){
            return a;
        }
        return b;
    }
    public static int max(int a, int b, int c){
        if(a>b){
            if(a>c){
                return a;
            }else{
                return c;
            }
        }
        return b;
    }
    public static int max(int a, int b, int c, int d){
        if(a>b && a>c && a>d){
            return a;
        }else if(b>a && b>c && b>d){
                return b;
        }else if(c>a && c>d && c>b){
                return c;
        }
        return d;
    }
}

package month1.week3.day2;
/*
Write a function` reminder() which
when pass one int value, return sum of digits for that value reminder(int)
when pass one int value and one natural int, return reminder from sum of digits divided to second parameter(reminder(int 331, int 5) {
return  (3 + 3 + 1) % 5
 */
public class Task10 {
    public static void main(String[] args) {
        int a=125;
        System.out.println(remainder(a));
        System.out.println(remainder(a, 3));
    }

    public static int remainder(int value) {
        int temp=value;
        int sum = 0;
        while (value > 0) {
            sum += value % 10;
            value /= 10;
        }
        return temp % sum;
    }

    public static int remainder(int value, int number) {
        int sum = 0;
        while (value > 0) {
            sum += value % 10;
            value /= 10;
        }
         return sum % number;
    }
}

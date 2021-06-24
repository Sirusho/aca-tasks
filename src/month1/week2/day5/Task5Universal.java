package month1.week2.Day5;

import java.util.Scanner;

public class Task5Universal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 2 numbers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (int i = a; i < b; i++) {
            //1600
            boolean flag = true;
            String first = String.valueOf(i);//"1600"
            //String second=String.valueOf(b);
            for (int j = 0; j < first.length(); j++) {
                if (first.charAt(j) != first.charAt(first.length() - j - 1)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(i);
            }
        }

    }
}

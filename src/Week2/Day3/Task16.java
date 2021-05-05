package Week2.Day3;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input N");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        //int count = 0;
        /*for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }
        while (count < n) {
            arr[count++] = 0;
        }

        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }

         */
                int count = 0;
                int temp;
                for (int i = 0; i < n; i++) {
                    if ((arr[i] != 0)) {
                        temp = arr[count];
                        arr[count] = arr[i];
                        arr[i] = temp;
                        count = count + 1;
                    }
                }
                for(int i=0; i<n; i++){
                    System.out.println(arr[i]);
                }
            }
    }
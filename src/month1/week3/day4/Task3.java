package month1.week3.Day4;

import java.util.Scanner;

/*
We have triangles made of blocks. The topmost row has 1 block, the next
row down has 2 blocks, the next row has 3 blocks, and so on. Compute
recursively (no loops or multiplication) the total number of blocks in
such a triangle with the given number of rows.
Example` triangle(0) -> 0
                triangle(1) -> 1
                triangle(2) -> 3
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("input n");
        int n = scanner.nextInt();
        System.out.println(triangle(n));
    }
    static int triangle(int n){
        if(n==0){
            return 0;
        }
        return n+triangle(n-1);
    }
}

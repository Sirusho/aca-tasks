package week2.Day2;

import java.util.Scanner;

public class TaskMatchingLetters {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input 2 strings");
        String a = scanner.nextLine();
        String b=scanner.nextLine();
        int count=0;
        for(int i=0; i<a.length(); i++){
                if(b.indexOf(a.charAt(i))>=0){
                    b=b.replaceFirst(""+a.charAt(i),"" );
                    count++;
                }
            }
        System.out.println(count);

    }
}

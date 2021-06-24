package month1.week3.Day5;
import java.util.Scanner;

/*
Write a function which receives as parameter String,char
sort it
find a char
 */
public class Task10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input a string");
        String input = scanner.nextLine();
        char c=scanner.nextLine().charAt(0);
        System.out.println(sortString(input));
        System.out.println(findChar(sortString(input), c));

    }
    static String  sortString(String string){
        char arr[]=new char[string.length()];
        for(int i=0; i<arr.length; i++){
            arr[i]=string.charAt(i);
        }
        for(int i=1; i<string.length(); i++){
            for(int j=0; j<string.length()-1; j++ ){
                if(arr[j]>arr[j+1]){
                    char temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        String newString="";
        for(int i=0; i<arr.length; i++){
            newString+=arr[i];
        }
        return newString;
    }
    static int findChar(String string, char c){
        for(int i=0; i<string.length(); i++){
            if(string.charAt(i)==c){
                return i;
            }
        }
        return -1;
    }

}

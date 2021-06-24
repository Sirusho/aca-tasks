package month1.week3.Day4;

import java.util.Scanner;

/*
 .Given a string containing only small English letters.
  Form a new line by "cutting" identical letters located at symmetrical places
  (that is, if there are 2 identical letters at the same distance from the center of the line,
  then they must be removed from the line). If the length of the string is odd,
   then the middle letter does not need to be shortened.
 */
public class Task17 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Input string");
        String str = scanner.nextLine();
        int mid=str.length()/2;
        int index=1;
        if(str.charAt(mid-index)==str.charAt(mid+index)){
            index++;
        }else{
            //str.charAt(mid-index) + str.charAt(mid+index)
                    index++;
        }

    }
    static String shortenString(String string, int left, int right){
        if(string.length()==1) {
            return "";
        }

        return string;
    }
}

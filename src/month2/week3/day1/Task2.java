package month2.week3;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> arr=new ArrayList<>();
        arr.add(0);
        arr.add(5);
        arr.add(6);
        arr.add(8);
        List<Integer> arr2=new ArrayList<>();
        arr2.add(0);
        arr2.add(5);
        arr2.add(6);
        arr2.add(7);

        System.out.println(compare(arr, arr2));


    }

    public static boolean compare(List arr, List arr2 ){
        int count=0;
        if(arr.size()!=arr2.size()){
            return false;
        }else{
            for (int i = 0; i <arr.size() ; i++) {
                if(arr.get(i).equals(arr2.get(i))){
                    count++;
                }
            }
        }
        return count==arr.size();

    }
}

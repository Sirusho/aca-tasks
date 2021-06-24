package month2.week3;

import java.util.ArrayList;
import java.util.List;

//Write a Java program to clone an array list to another array list.
public class Task5 {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(0);
        arr.add(5);
        arr.add(6);
        arr.add(8);
        ArrayList res= clone(arr);
        for (int i = 0; i <res.size() ; i++) {
            System.out.print(res.get(i) + " ");
        }

    }

    public static ArrayList clone(ArrayList arr){
        ArrayList newArr=new ArrayList();
        for (int i = 0; i <arr.size() ; i++) {
            newArr.add(arr.get(i));
        }
        return newArr;
    }
}

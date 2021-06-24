package month2.week3;

import java.util.ArrayList;
import java.util.List;
//4. Write a Java program to join two array lists.
public class Task4 {
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
        arr2.add(8);
        List newList=join(arr, arr2);
        for (int i = 0; i <newList.size() ; i++) {
            System.out.print(newList.get(i) + " ");
        }
    }

    public static List join(List list1, List list2){
        List list=new ArrayList();
        for (int i = 0; i <list1.size() ; i++) {
            list.add(list1.get(i));
        }
        for (int i = 0; i <list2.size() ; i++) {
            list.add(list2.get(i));
        }
        return list;
    }
}

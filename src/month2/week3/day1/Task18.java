package month2.week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//18.How do you find duplicate numbers in an array if it contains multiple duplicates?
public class Task18 {
    public static void main(String[] args) {
        List<Integer> arr2=new ArrayList<>();
        arr2.add(0);
        arr2.add(5);
        arr2.add(6);
        arr2.add(8);
        arr2.add(9);
        List<Integer> duplicates=new ArrayList<>();
        arr2.sort(Integer::compareTo);
        for (int i = 0; i <arr2.size(); i++) {

        }
    }
}

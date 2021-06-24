package month2.week3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task12 {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<String>();
        list.add("aa1");
        list.add("aa2");
        list.add("aa3");
        List<String> list2=new ArrayList<>(list);
        for (int i = 0; i < list2.size(); i++) {
            System.out.print(list2.get(i) + " ");

        }
    }
}

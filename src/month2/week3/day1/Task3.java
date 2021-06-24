package month2.week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//3. Write a Java program of swap two elements in an array list.
public class Task3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f"));

        System.out.println(list);

        Collections.swap(list, 1, 2);

        System.out.println(list);

    }
}

package month2.week3;

import java.util.LinkedList;

//14. Write a Java program to replace an element in a linked list.
public class Task14 {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.set(0,0);
        System.out.println(linkedList.get(0));


    }
}

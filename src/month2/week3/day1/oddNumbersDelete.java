package month2.week3;

import java.util.ArrayList;
import java.util.List;

public class oddNumbersDelete {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        list.add(4);
        list.add(5);
        list.add(7);
        list.add(8);
        list.add(4);
        list.add(1);

        for(int i=0; i<list.size(); i++){
            if(list.get(i)%2==1){
                list.remove(list.get(i));
                i--;
            }
        }
        for (int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+ " ");
        }
    }
}

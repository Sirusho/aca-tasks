package month2.week3;

import java.util.*;

public class TreeMapTasks {
    public static void main(String[] args) {
        TreeMap<Integer, String > treeMap=new TreeMap<>();
        treeMap.put(1, "asd");
        treeMap.put(2, "sdas");
        treeMap.put(5, "sdqa");
        treeMap.put(6, "sdghgqa");


        Set<Integer> integers = treeMap.keySet();
        getMinAndMaxKeyValues(treeMap, integers);


    }
    static <K, V, T>void reverseKyes( TreeMap<K, V> treeMap){
        Set<T> set= (Set<T>) treeMap.keySet();
        Collections.reverse((List<?>) set);

    }
    private static void getMinAndMaxKeyValues(TreeMap<Integer, String> treeMap, Set<Integer> integers) {
        Iterator<Integer> iterator = integers.iterator();
        int count=0;
        while (iterator.hasNext()){
            int k = iterator.next();
            if(count==0 || count==integers.size()-1) {
                System.out.println(treeMap.get(k));
            }
            count++;

        }
    }

    static <K, V> TreeMap<K, V> copyTreeMap(TreeMap <K, V> treeMap){
        TreeMap<K, V> resTree=new TreeMap<>();
        Iterator<Map.Entry<K, V>> iterator=treeMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<K, V> next = iterator.next();
            resTree.put(next.getKey(), next.getValue());
        }
        return resTree;
    }

}

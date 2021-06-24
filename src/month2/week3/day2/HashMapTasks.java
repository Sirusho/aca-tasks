package month2.week3;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapTasks {
    public static void main(String[] args) {
//        ConcurrentHashMap<Integer, String> map=new ConcurrentHashMap<>();
//        map.put(1, "aa");
//        map.put(2, "bb");
        //HashMap<Integer, String> newMap= copyAllMappings(map);
        //deleteAllMappings(map);
//        for (Map.Entry<Integer, String> set : map.entrySet()) {
//            System.out.println(set.getKey() + " = " + set.getValue());
//        }
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "adcc");
        map.put(2, "dfwdc");
        map.put(48, "dfs");
        map.put(1, "axd");
        // System.out.println(isMapEmpty(map));
        // System.out.println(printKeys(map));
        System.out.println(printValues(map));

    }

    public static <K, V, T> ArrayList<T> printValues(HashMap<K, V> map) {
        ArrayList<T> arr = new ArrayList<T>();
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            arr.add((T) it.next().getValue());
        }
        return arr;
    }

    public static <K extends Comparable, V extends Comparable, T extends Comparable> ArrayList<T> printValuesGreater(HashMap<K, V> map, T value) {
        ArrayList<T> arr = new ArrayList<T>();
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getValue().compareTo(value) > 0) {
                arr.add((T) it.next().getValue());
            }
        }
        return arr;
    }

    public static <K extends Comparable, V extends Comparable, T extends Comparable> V printLeastValueGreater(HashMap<K, V> map, T value) {
        V resValue = null;
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();

        while (it.hasNext()) {
            if (it.next().getValue().compareTo(value) > 0) {
                resValue = it.next().getValue();
            }
        }
        return resValue;
    }


    public static Set printKeys(HashMap map) {
        Set set = map.keySet();
        Iterator iterator = set.iterator();
        return set;
    }

    public static <K, V> boolean isMapEmpty(HashMap map) {
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        int count = 0;
        if (it.hasNext()) {
            return false;
        }
        return true;
    }

    public static <K, V> void deleteAllMappings(ConcurrentHashMap<K, V> hashMap) {
        Iterator<Map.Entry<K, V>> it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            it.remove();
            it.next();
        }
    }

    public static <K, V> HashMap copyAllMappings(HashMap<K, V> hashMap) {
        HashMap res = new HashMap();
        Iterator<Map.Entry<K, V>> it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> set = it.next();
            res.put(set.getKey(), set.getValue());
        }
        return res;

    }
}

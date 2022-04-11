package Collections4;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/** Sorted Maps **/

class Temp {

}

public class App {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

        System.out.println(new Temp()); // generates hash code

        Map<Integer, String> treeMap = new TreeMap<>();

        testMap(hashMap); // returns keys in numerical order
        System.out.println();
        testMap(linkedHashMap); // returns keys in order placed
        System.out.println();
        testMap(treeMap); // returns keys in numberical order
    }

    public static void testMap(Map<Integer, String> map) {
        map.put(9, "fox");
        map.put(4, "cat");
        map.put(8, "dog");
        map.put(1, "giraffe");
        map.put(0, "swan");
        map.put(15, "bear");
        map.put(6, "snake");

        // iterate through map
        for (Integer key : map.keySet()) { // returns a set of keys
            String value = map.get(key);

            System.out.println(key + ": " + value);
        }
    }
}

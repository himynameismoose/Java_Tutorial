package Collections3;

import java.util.HashMap;
import java.util.Map;

/** HashMap **/
public class App {
    public static void main(String[] args) {

        // key, value
        HashMap<Integer, String> map = new HashMap();

        map.put(5,"Five");
        map.put(8,"Eight");
        map.put(6,"Six");
        map.put(4,"Four");
        map.put(2,"Two");

        // cannot duplicate key

        String text = map.get(4);
        System.out.println(text);

        map.put(6, "Hello"); // overrides "Six"
        text = map.get(6);
        System.out.println(text);

        // iterate through map
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();

            System.out.println(key + ", " + value);
        }

        // hashmap is NOT sorted
    }
}

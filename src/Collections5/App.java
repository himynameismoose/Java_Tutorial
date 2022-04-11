package Collections5;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/** Sets **/
public class App {
    public static void main(String[] args) {

        // HashSet does not retain order.
        Set<String> set1 = new HashSet<>();

        set1.add("dog");
        set1.add("cat");
        set1.add("mouse");
        set1.add("snake");
        set1.add("bear");

        System.out.println(set1); // does not print in order

        set1.add("mouse");

        System.out.println(set1); // mouse already exists, no two mouse

        // LinkedHashSet remembers the order you added items in
        Set<String> set2 = new LinkedHashSet<>();

        set2.add("dog");
        set2.add("cat");
        set2.add("mouse");
        set2.add("snake");
        set2.add("bear");

        System.out.println(set2);

        // TreeSet sorts in natural order
        Set<String> set3 = new TreeSet<>();

        if (set3.isEmpty())
            System.out.println("Set is empty at start");

        set3.add("dog");
        set3.add("cat");
        set3.add("mouse");
        set3.add("snake");
        set3.add("bear");

        if (set3.isEmpty())
            System.out.println("Set is empty after adding (no!");

        System.out.println(set3);

        ////// Iteration /////
        for (String element : set3) {
            System.out.println(element);
        }

        // Does set contains a given item?
        if (set3.contains("aardvark"))
            System.out.println("Contains aardvark");

        if (set3.contains("cat"))
            System.out.println("Contains cat");

        /// set4 contains some common elements with set3, and some new

        ///// Intersection /////
        Set<String> set4 = new TreeSet<>();

        set4.add("dog");
        set4.add("cat");
        set4.add("giraffe");
        set4.add("monkey");
        set4.add("ant");

        Set<String> intersection = new HashSet<>(set3);

        System.out.println(intersection);

        // keeps only elements in both sets
        intersection.retainAll(set4);

        System.out.println(intersection);

        ///// Difference /////
        Set<String> difference = new HashSet<String>(set4);

        difference.removeAll(set3);
        System.out.println(difference);
    }
}

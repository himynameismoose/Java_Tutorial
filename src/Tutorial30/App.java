package Tutorial30;

import java.util.ArrayList;
import java.util.HashMap;

/** Using Generics **/

class Animal {

}

public class App {
    public static void main(String[] args) {

        //// Before Java 5 ////
        ArrayList list = new ArrayList();
        // add to list
        list.add("apple");
        list.add("banana");
        list.add("orange");

        String fruit = (String) list.get(1); // downcast to String
        System.out.println(fruit);

        //// Modern Style ////
        ArrayList<String> strings = new ArrayList<String>();

        strings.add("cat");
        strings.add("dog");
        strings.add("alligator");

        String animal = strings.get(1);
        System.out.println(animal);

        HashMap<Integer, String> map = new HashMap<Integer, String>();

        //// Java 7 style ////
        ArrayList<Animal> someList = new ArrayList<>();
    }
}

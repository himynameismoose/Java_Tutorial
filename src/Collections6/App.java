package Collections6;

import java.util.*;

/** Adding objects to Maps and Sets **/

class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "{ID is: " + id + "; name is: " + name + "}";
    }

    // implement the equals() and hashCode() to get rid of duplicates
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

public class App {
    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();

        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        //map.put("one", 1); // key already exists, but will compile

        for (String key : map.keySet())
            System.out.println(key + ": " + map.get(key));

        Set<String> set = new LinkedHashSet<>();

        set.add("dog");
        set.add("cat");
        set.add("mouse");
        //set.add("cat"); // cat is duplicate, will compile

        System.out.println(set);

        System.out.println();

        Person p1 = new Person(0, "Bob");
        Person p2 = new Person(1, "Sue");
        Person p3 = new Person(2, "Mike");
        Person p4 = new Person(1, "Sue");

        Map<Person, Integer> map2 = new LinkedHashMap<>();

        map2.put(p1, 1);
        map2.put(p2, 2);
        map2.put(p3, 3);
        map2.put(p4, 1);

        for (Person key : map2.keySet())
            System.out.println(key + ": " + map2.get(key));

        Set<Person> set2 = new LinkedHashSet<>();

        set2.add(p1);
        set2.add(p2);
        set2.add(p3);
        set2.add(p4);

        System.out.println(set2);

    }
}

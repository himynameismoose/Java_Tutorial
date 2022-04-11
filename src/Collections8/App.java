package Collections8;

import java.util.*;

/** Natural Order **/
class Person implements Comparable<Person> {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Person person) {
        // return -name.compareTo(person.name);

        int len1 = name.length();
        int len2 = person.name.length();

        if (len1 > len2)
            return 1;
        else if(len1 < len2)
            return -1;
        else
            // return if name length are the same
            return name.compareTo(person.name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

public class App {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        SortedSet<String> set = new TreeSet<>();

//        addElements(list);
//        addElements(set);
//
//        Collections.sort(list);
//
//        showElements(list);
//        System.out.println();
//        showElements(set);

        // Using Person class

        List<Person> list2 = new ArrayList<>();
        SortedSet<Person> set2 = new TreeSet<>();

        addElements(list2);
        addElements(set2);

        Collections.sort(list2);

        showElements(list2);
        System.out.println();
        showElements(set2);
    }

//    private static void addElements(Collection<String> col) {
//        col.add("Joe");
//        col.add("Sue");
//        col.add("Juliet");
//        col.add("Clare");
//        col.add("Mike");
//    }
//
//    private static void showElements(Collection<String> col) {
//         for (String element : col)
//             System.out.println(element);
//    }

    private static void addElements(Collection<Person> col) {
        col.add(new Person("Joe"));
        col.add(new Person("Sue"));
        col.add(new Person("Juliet"));
        col.add(new Person("Clare"));
        col.add(new Person("Mike"));
    }

    private static void showElements(Collection<Person> col) {
        for (Person element : col)
            System.out.println(element);
    }
}
package Collections7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/** Sorting **/
class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return id + ": " + name;
    }
}

class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {

        int len1 = s1.length();
        int len2 = s2.length();

        if (len1 > len2)
            return 1;
        else if (len1 < len2)
            return -1;

        return 0;
    }
}

class AlphabeticalComparator implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {

        return s1.compareTo(s2);
    }
}

class ReverseAlphabeticalComparator implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {

        return -s1.compareTo(s2);
    }
}

public class App {
    public static void main(String[] args) {

        ///// Sorting Strings /////
        List<String> animals = new ArrayList<>();

        animals.add("tiger");
        animals.add("lion");
        animals.add("cat");
        animals.add("snake");
        animals.add("mongoose");
        animals.add("elephant");

        // sort animals by the length of the string
        animals.sort(new StringLengthComparator());
        animals.sort(new AlphabeticalComparator());
        animals.sort(new ReverseAlphabeticalComparator());

        for (String animal : animals)
            System.out.println(animal);

        ///// Sorting Numbers /////
        List<Integer> numbers = new ArrayList<>();

        numbers.add(3);
        numbers.add(36);
        numbers.add(73);
        numbers.add(40);
        numbers.add(1);

        numbers.sort((num11, num2) -> -num11.compareTo(num2));

        for (Integer number: numbers)
            System.out.println(number);

        ///// Sorting Objects /////

        List<Person> people = new ArrayList<>();

        people.add(new Person(1, "Joe"));
        people.add(new Person(3, "Bob"));
        people.add(new Person(4, "Clare"));
        people.add(new Person(2, "Sue"));

        // sort in order of ID
        people.sort((p1, p2) -> {
            if (p1.getId() > p2.getId())
                return 1;
            else if (p1.getId() < p2.getId())
                return -1;

            return 0;
        });

        System.out.println("\n");
        for (Person person : people)
            System.out.println(person);

        // sort in order of name
        people.sort(Comparator.comparing(Person::getName));

        for (Person person : people)
            System.out.println(person);
    }
}

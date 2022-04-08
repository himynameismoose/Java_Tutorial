package Tutorial48;

import java.io.Serializable;

public class Person implements Serializable {

    private transient int id; // transient -> prevents things from being serialized
    private String name;

    private static int count;

    public Person() {
        System.out.println("Default constructor");
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Person.count = count;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}' + " Count is: " + count;
    }
}

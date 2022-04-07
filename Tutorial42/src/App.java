import java.util.Objects;

/** The Equals Method **/

class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    // Generate equals() and hashCode()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
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
        Person person1 = new Person(5, "Bob");
        Person person2 = new Person(8, "Sue");

        System.out.println(person1 == person2); // false

        person2 = person1;
        System.out.println(person1 == person2); // true

        Person person3 = new Person(5, "Bob");
        Person person4 = new Person(5, "Bob");

        System.out.println(person3 == person4); // false
        // even though person3 is equal to person4
        // there are NOT the same object

        // use the .equals()
        System.out.println(person3.equals(person4)); // true, after generating equals() and hashCode() in Person

        // How do we compare so it is true?
        // generate equals() and hashCode() to Person class

        Double value1 = 7.2;
        Double value2 = 7.2;

        System.out.println(value1 == value2); // false
        // use equals()
        System.out.println(value1.equals(value2)); // true

        Integer number1 = 6;
        Integer number2 = 6;

        System.out.println(number1 == number2); // true

        String text1 = "Hello";
        String text2 = "Hello";
        System.out.println(text1 == text2); // true


        // Use == to check if two references point at the same object

        text2 = "Hellodfadf".substring(0, 5);
        // use .equals to compare strings
        System.out.println(text1.equals(text2)); // true

        System.out.println(new Object());
        // java.lang.Object@23fc625e
    }
}

package Tutorial13;

// represents an idea of a person in general
class Person {
    // Instance variables (data or "state")
    String name;
    int age;


    // Classes can contain

    // 1. Data
    // 2. Subroutines (methods)
}

// Classes and Objects
public class App {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("there");

        // Create Person
        Person person1 = new Person();

        person1.name = "Joe Bloggs";
        person1.age = 37;

        Person person2 = new Person();
        person2.name = "Sarah Smith";
        person2.age = 20;

        System.out.println(person1.name);
    }
}

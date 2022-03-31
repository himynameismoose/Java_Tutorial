package Tutorial3;

public class Application {
    public static void main(String[] args) {
        int myInt = 7;

        String text = "Hello";
        // String is a class and a type
        System.out.println(text);

        String blank = " ";
        String name = "Bob";
        // Add strings together
        String greeting = text + blank + name;
        System.out.println(greeting);

        System.out.println("Hello" + " " + "Bob"); // Same as greeting

        System.out.println("My integer is: " + myInt); // concatenate

        double myDouble = 7.8;
        System.out.println("My number is: " + myDouble);
    }
}

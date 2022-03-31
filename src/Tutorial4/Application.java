package Tutorial4;

public class Application {
    public static void main(String[] args) {
        boolean loop = true;
        System.out.println(loop);

        loop = 4 < 5; // reassign loop
        System.out.println(loop);

        loop = 6 < 1; // false
        System.out.println(loop);

        int value = 10;
        loop = value < 20;
        System.out.println(loop); // true

        value = 0; // reassign value
        while (value < 10) { // condition -> is value less than 10?
            System.out.println("Hello");
            value = value + 1;
        }
    }
}

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        // Adding
        numbers.add(10);    // index 0
        numbers.add(100);
        numbers.add(40);

        // Retrieving
        System.out.println(numbers.get(0)); // returns 10

        System.out.println("Iteration #1");
        // Indexed for loop iteration
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        // remove items (careful)
        numbers.remove(numbers.size() - 1);

        // This is VERY slow
        // removing the first item is very slow
        // copies all subsequent items back into arraylist
        numbers.remove(0);

        System.out.println("\nIteration #2");
        for (Integer value : numbers) {
            System.out.println(value);
        }

        // List interface ...
        List<String> values = new ArrayList<>();


    }
}

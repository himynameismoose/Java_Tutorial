package Tutorial7;

import java.util.Scanner;

// Get user input
public class App {
    public static void main(String[] args) {
        // The Scanner class
        // create new Scanner
        // pass in System.in that is coming from the console
        // (the user types into the console and will be read by Scanner)
        Scanner input = new Scanner(System.in);

//        // Output the prompt
//        System.out.println("Enter a line of text: ");
//
//        // Wait for the user to enter a line of text
//        String line = input.nextLine();
//
//        // Tell them what they entered.
//        System.out.println("You entered: " + line);
//
//        System.out.println("Enter an integer:" );
//        int value = input.nextInt();
//        System.out.println("You entered: " + value);

        System.out.println("Enter a floating point value: ");
        double value = input.nextDouble();

        System.out.println("Yout entered: " + value);
    }

}

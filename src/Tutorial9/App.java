package Tutorial9;

import java.util.Scanner;

// Switch
public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a command: ");
        String text = input.nextLine();

        // enhanced switch statement
        switch (text) {
            case "start" -> System.out.println("Machine started!");
            case "stop" -> System.out.println("Machine stopped.");
            default -> System.out.println("Command not regonized");
        }
    }
}

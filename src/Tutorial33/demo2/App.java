package Tutorial33.demo2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args)  {

        File file = new File("test.txt");

        // try/catch block
        try {
            // try this first
            FileReader fr = new FileReader(file);

            // this will not be executed if an exception is thrown.
            System.out.println("Continuing ...");
        } catch (FileNotFoundException e) { // otherwise, catch with exception
            System.out.println("File not found: " + file.toString());
        }

        System.out.println("Finished.");
    }
}

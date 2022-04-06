package Tutorial36;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

/** Multiple Exceptions **/

public class App {
    public static void main(String[] args) {
        Test test = new Test();

        /*
        try {
            test.run();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            System.out.println("Couldn't parse command file.");
        }
         */

        /*
        try {
            test.run();
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
         */

        try {
            test.run();
        } catch (Exception e) { // catch any exception
            e.printStackTrace();
        }

        try {
            test.input();
        } catch (FileNotFoundException e) { // handle child exceptions first!
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

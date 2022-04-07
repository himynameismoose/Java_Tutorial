package Tutorial40;

import java.io.*;

public class App2 {
    public static void main(String[] args) {
        File file = new File("src/Tutorial40/test.txt");

        // FileReader fr = new FileReader(file);
        // pass FileReader in BufferedReader constructor
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {

        } catch (FileNotFoundException e) {
            System.out.println("Can't find file " + file);
        } catch (IOException e) {
            System.out.println("Unable to read file " + file);
        }

    }
}

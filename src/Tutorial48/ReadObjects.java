package Tutorial48;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjects {
    public static void main(String[] args) {
        System.out.println("Reading objects ...");

        try (ObjectInputStream os = new ObjectInputStream(new FileInputStream("test.ser"))) {

            Person person = (Person) os.readObject();
            System.out.println(person);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

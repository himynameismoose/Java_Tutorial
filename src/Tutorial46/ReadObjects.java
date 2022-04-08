package Tutorial46;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjects {
    public static void main(String[] args) {
        System.out.println("Reading object ...");

        try (FileInputStream fi = new FileInputStream("src/Tutorial46/people.bin")) {

            ObjectInputStream os = new ObjectInputStream(fi);

            Person person1 = (Person) os.readObject(); // need to cast known object
            Person person2 = (Person) os.readObject();

            os.close();

            System.out.println(person1);
            System.out.println(person2);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

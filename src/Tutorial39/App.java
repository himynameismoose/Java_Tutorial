package Tutorial39;

import java.io.*;

/** Reading files with FileReader **/

public class App {
    public static void main(String[] args) {

        File file = new File("src/Tutorial39/test.txt");
        BufferedReader br = null;

        try {
            FileReader fr = new FileReader(file);
            br = new BufferedReader(fr);

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file);
        } catch (IOException e) {
            System.out.println("Unable to read file: " + file);
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                System.out.println("Unable to close file: " + file);
            } catch (NullPointerException ex) {
                // file was never opened
            }
        }
    }
}

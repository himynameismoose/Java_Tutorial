package Tutorial11;

// Arrays of Strings
public class App {
    public static void main(String[] args) {
        // Allocate memory for 3 strings
        /*
        String[] words = new String[3];

        words[0] = "Hello";
        words[1] = "to";
        words[2] = "you";

        System.out.println(words[2]);

        String[] fruits = {"apple", "banana", "pear", "kiwi"};

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
         */

        int value = 0; // primitive

        String text; // String non-primitive (class)

        // reference to address of memory

        text = null; // point this address to nothing

        System.out.println(text);

        String[] texts = new String[2];

        System.out.println(texts[0]);

        texts[0] = "one";


    }
}

package Tutorial37;

/** Runtime vs. Checked Exceptions **/

public class App {
    public static void main(String[] args) {
        // checked exception
        // try {
        //    Thread.sleep(111);
        // } catch (InterruptedException e) {
        //    e.printStackTrace();
        // }

        // int value = 7;
        // value = value / 0; // runtime exception
        // Arithmetic exception is a child class of runtime exception
        // does not force you to catch the exception

        // null pointer exception
        // String text = null;
        // will not compile
        // System.out.println(text.length());

        // array out of bounds exception
        String[] text = {"one", "two", "three"};
        // System.out.println(text[3]); // cannot access --- ArrayIndexOutOfBoundsException

        try {
            System.out.println(text[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}

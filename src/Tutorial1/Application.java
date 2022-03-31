package Tutorial1;

public class Application {
    public static void main(String[] args) {
        // First tutorial
        // Print in console -> Hello World!
        //System.out.println("Hello World!");

        // Second tutorial
        //int myNumber;                   // create myNumber of type int
        //myNumber = 88;                  // initialize myNumber to 88
        //System.out.println(myNumber);   // print myNumber


        // Create and initialize in one line
        int myNumber = 88;
        System.out.println(myNumber);

        /* Data types for numbers
            int     32-bit
            short   16-bit
            long    64-bit

            -- Floating point numbers --
            double
            float
         */

        short myShort = 847;
        System.out.println(myShort);

        long myLong = 9797;
        System.out.println(myLong);

        double myDouble = 7.3243;
        System.out.println(myDouble);

        float myFloat = 324.3f; // Place an 'f' at the end of any float -> double
        System.out.println(myFloat);

        // doubles and ints are the most commonly used values

        /* Other types
            char    unicode character
            boolan  logic -> true/false

            byte
         */

        char myChar = 'y'; // Uses single quotes ''
        System.out.println(myChar);

        boolean myBoolean = true; // Uses true or false
        System.out.println(myBoolean);

        byte myByte = 127;
        System.out.println(myByte);
    }
}

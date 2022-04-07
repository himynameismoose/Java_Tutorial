package Tutorial45;

/** Recursion **/
public class App {
    public static void main(String[] args) {
        //System.out.println("Hello"); // put in calculate()

//        int value = 4;
//        calculate(value); // value as parameter
//        System.out.println(value); // 4

        // E.g. 4! (4 factorial) = 4*3*2*1
        System.out.println(factorial(2));
    }

    private static int factorial(int value) {
//        System.out.println("Hello");
//        System.out.println(value);
//
//        value = value - 1;
//        System.out.println(value); // 3

        // System.out.println(value);
        // keeps going in an infinite loop
        // calculate(value); // stackoverflowerror

        // need to find a way so that it stops calling itself

        // calculate(value - 1); // same error

        if (value == 1)  {
            return 1;
        }

        return factorial(value - 1) * value;
    }
}

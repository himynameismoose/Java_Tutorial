package Tutorial6;

// This tutorial is about if statements
public class Application {
    //psvm -> creates main() w/o typing all of that out
    public static void main(String[] args) {
        boolean cond = 1 < 6; // true
        cond = 3 > 8; // false
        cond = 5 != 2; // true
        cond = 5 != 5; // false
        cond = 4 == 3; // false

        System.out.println(cond);

        if (4 == 4) { // true, prints
            System.out.println("Yes, it's true!");
        }

        int myInt = 5;
        if (myInt < 10) { // false, does not print
            System.out.println("Yes, it's true!");
        } else if (myInt > 20) {
            System.out.println("No, it's false!");
        } else {
            System.out.println("None of the above");
        }

        int loop = 0;

        while (loop < 5) {
            System.out.println("Looping: " + loop);

            if (loop == 5) {
                break; // break out of the loop
            }

            loop++; // do not forget to increment otherwise infinite loop

            System.out.println("Running");
        }
    }
}

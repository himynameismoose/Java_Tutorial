package Tutorial19;

// Static variables and final

class Thing {
    public final static int LUCKY_NUMBER = 7;

    public String name;
    // keyword static
    public static String description;

    public static int count = 0; // belongs to the class, not object

    public int id;

    public Thing() {
        id = count;
        count++;
    }

    public void showName() {
        System.out.println("Object id " + id + ", " + description + ": " + name);
    }

    public static void showInfo() {
        System.out.println(description);
//        System.out.println(name); // cannot do this
    }
}

public class App {
    public static void main(String[] args) {

        Thing.description = "I am a thing";

        Thing.showInfo();

        System.out.println("Before creating objects, count is: " + Thing.count);

//        System.out.println(Thing.description);

        Thing thing1 = new Thing();
        Thing thing2 = new Thing();

        System.out.println("After creating objects, count is: " + Thing.count);


        thing1.name = "Bob";
        thing2.name = "Sue";

        //System.out.println(thing1.name);
        //System.out.println(thing2.name);

        thing1.showName();
        thing2.showName();

        System.out.println(Math.PI); // PI is a constant value from the Math class

        //Math.PI = 3; // you cannot change a constant value

        System.out.println(Thing.LUCKY_NUMBER);
    }
}
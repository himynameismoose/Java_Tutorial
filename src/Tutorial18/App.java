package Tutorial18;

// Constructors

class Machine {
    // instance variables
    private String name;
    private int code;

    public Machine() { // Constructor for class Machine
        this("Arnie", 0);
        System.out.println("Constructor running!");

        //name = "Arnie";
    }

    public Machine(String name) {
        this(name, 0);
        System.out.println("Second constructor running");
        this.name = name;
    }

    public Machine(String name, int code) {
        System.out.println("Third constructor running");
        this.name = name;
        this.code = code;
    }
}

public class App {
    public static void main(String[] args) {
        Machine machine1 = new Machine();

        //new Machine(); // invokes new constructor

//        Machine machine2 = new Machine("Bertie");
//
//        Machine machine3 = new Machine("Chalky", 7);
    }
}

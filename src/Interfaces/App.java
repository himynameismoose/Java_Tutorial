package Interfaces;

public class App {
    public static void main(String[] args) {
        Machine mach1 = new Machine();
        mach1.start();

        Person person1 = new Person("Bob");
        person1.greet();

        Info info1 = new Machine();
        info1.showInfo();

        Info info2 = person1; // point info2 to person1
        info2.showInfo();

        System.out.println();
        // use outputInfo() to showInfo()
        outputInfo(mach1);
        outputInfo(person1);
    }

    private static void outputInfo(Info info) {
        info.showInfo();
    }
}

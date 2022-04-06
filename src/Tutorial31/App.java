package Tutorial31;

import java.util.ArrayList;

/**
 * Generics and wilcard
 */

class Machine {
    @Override
    public String toString() {
        return "I am a machine";
    }

    public void start() {
        System.out.println("Machine starting");
    }
}

class Camera extends Machine {
    @Override
    public String toString() {
        return "I am a camera";
    }

    public void snap() {
        System.out.println("snap!");
    }
}

public class App {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("one");
        list.add("two");

        // showList(list);

        ArrayList<Machine> list2 = new ArrayList<>();

        list2.add(new Machine());
        list2.add(new Machine());

        showList(list2); // prints out toString() from Machine

        ArrayList<Machine> list3 = new ArrayList<>();

        list3.add(new Camera());
        list3.add(new Camera());

        showList(list3);
        showList2(list2);
    }

    public static void showList(ArrayList<? extends Machine> list) {
        // iterate through list
        for (Machine value : list) {
            System.out.println(value);
            value.start();
        }
    }

    public static void showList2(ArrayList<? super Camera> list) {
        // iterate through list
        for (Object value : list) {
            System.out.println(value);
        }
    }
}

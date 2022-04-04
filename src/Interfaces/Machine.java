package Interfaces;

public class Machine implements Info {

    private int id = 7;

    public void start() {
        System.out.println("Machine started");
    }

    @Override // implemented from Info
    public void showInfo() {
        System.out.println("Machine ID is: " + id);
    }
}

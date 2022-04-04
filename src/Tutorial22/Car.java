package Tutorial22;

public class Car extends Machine { // Car is child of Machine

    @Override
    public void start() {
        System.out.println("Car started.");
    }

    public void wipeWindShield() {
        System.out.println("Wiping windshield");
    }

    public void showInfo() {
        System.out.println("Car name: " + name);
    }
}

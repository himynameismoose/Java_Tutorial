package Tutorial29;

class Machine {
    public void start() {
        System.out.println("Machine started.");
    }
}

class Camera extends Machine{
    public void start() {
        System.out.println("Camera started.");
    }

    public void snap() {
        System.out.println("Photo taken.");
    }
}


public class App {
    public static void main(String[] args) {
        Machine machine1 = new Machine();
        Camera camera1 = new Camera();

        machine1.start();
        camera1.start();
        camera1.snap();

        // Upcasting
        Machine machine2 = camera1;
        machine2.start(); // Camera started.
        // this won't work
        // machine2.snap();
        // the variable machine2 is a Machine
        // Machine does not have the method snap()

        // Downcasting
        Machine machine3 = new Camera();
        // cannot be called
        // machine3.snap();
        // How to invoke snap() ?
        Camera camera2 = (Camera) machine3; // Cast Camera to machine3
        camera2.start();
        camera2.snap(); // It works!

        // This doesn't work! --- runtime error
        // Machine machine4 = new Machine();
        // This will cause an error
        // Camera camera3 = (Camera) machine4; // cannot be cast
        // camera3.start();
    }
}

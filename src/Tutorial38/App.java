package Tutorial38;

/** Abstract classes **/
public class App {
    public static void main(String[] args) {
        Camera cam1 = new Camera();
        cam1.setId(5);

        Car car1 = new Car();
        car1.setId(4);

        // Machine machine1 = new Machine(); // cannot instantiate abstract class

        car1.run();
    }
}

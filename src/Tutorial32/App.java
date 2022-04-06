package Tutorial32;

/** Anonymous Classes **/

class Machine {
    public void start() {
        System.out.println("Starting machine ...");
    }
}

interface Plant {
    public void grow();
}

public class App {
    public static void main(String[] args) {

        // Anonymous class
        Machine machine1 = new Machine() {
            // Override methods
            @Override
            public void start() {
                System.out.println("Camera snapping ...");
            }
        };

        machine1.start();

        // Not legal, cannot instantiate interfaces
        // Plant plant1 = new Plant();
        Plant plant1 = new Plant() {
            // implement methods --- override
            @Override
            public void grow() {
                System.out.println("Plant growing ...");
            }
        };

        plant1.grow();
    }
}

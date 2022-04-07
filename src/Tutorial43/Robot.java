package Tutorial43;

public class Robot {
    private int id;

    // Nested class
    public class Brain {
        public void think() {
            System.out.println("Robot " + id + " is thinking");
        }
    }

    public static class Battery {
        public void charge() {
            System.out.println("Battery charging ...");
            // cannot access id because not static
        }
    }

    public Robot(int id) {
        this.id = id;
    }

    public void start() {
        System.out.println("Starting robot " + id);

        Brain brain = new Brain();
        brain.think();

        String name = "Robert";

        class Temp {
            // can access id

            public void doSomething() {
                System.out.println("ID is: " + id);
                System.out.println("My name is: " + name);
            }
        }

        Temp temp = new Temp();
        temp.doSomething();
    }
}

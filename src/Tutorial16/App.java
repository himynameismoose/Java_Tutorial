package Tutorial16;

class Robot {
    // Pass in some text to this method
    public void speak(String text) {
        // print parameter
        System.out.println(text);
    }

    public void jump(int height) {
        System.out.println("Jumping: " + height);
    }

    public void move(String direction, double distance) {
        System.out.println("Moving " + distance + " meters in direction " + direction);
    }
}

// Method parameters
public class App {
    public static void main(String[] args) {
        Robot sam = new Robot();

        // pass parameter to the method
        sam.speak("Hi I'm Sam.");
        sam.jump(7);

        sam.move("West", 12.2);

        String greeting = "Hello there.";

        sam.speak(greeting);

        int value = 14;
        sam.jump(value);
    }
}

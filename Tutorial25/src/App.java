import world.Plant;

public class App {
    public static void main(String[] args) {
        Plant plant = new Plant();

        System.out.println(plant.name);
        System.out.println(plant.ID);

        // Will not work
        // type is private
        //System.out.println(plant.type);

        // size is protected
        // App is not in the same package as Plant
        // won't work
        //System.out.println(plant.size);

        // won't work
        // App and Plant in different packages
        // height has package-level visibility
        //System.out.println(plant.height);
    }
}
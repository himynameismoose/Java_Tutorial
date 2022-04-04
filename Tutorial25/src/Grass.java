import world.Plant;

public class Grass extends Plant {
    public Grass() {
        // this won't work
        // height cannot be accessed
        // Grass not in same package of Plant
        // Even though it's a subclass
        //System.out.println(height);
    }
}

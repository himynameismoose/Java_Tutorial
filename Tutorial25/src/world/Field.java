package world;

public class Field {
    private Plant plant = new Plant();

    public Field() {
        // size is protected
        // world.Field is in the same package as world.Plant
        System.out.println(plant.size);
    }
}

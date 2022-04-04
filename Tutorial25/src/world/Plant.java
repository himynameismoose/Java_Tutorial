package world;

class Something {

}

public class Plant {
    // Bad practice
    // Don't display public
    public String name;

    // If it's public, make it a constant
    // Acceptable practice -- it's final
    public final static int ID = 8;

    private String type;

    protected String size;

    int height;

    public Plant() {
        name = "Freddy";
        type = "plant";
        size = "medium"; // can be an enumerator
        height = 8;
    }

}

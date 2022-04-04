package world;

public class Oak extends Plant {

    public Oak() {
        // will not work
        // type is private in world.Plant
        //type = "tree";

        // this works
        // size is protected
        // world.Oak is a subclass of world.Plant
        size = "large";

        // No access specifier
        // works beause Oak and Plant are in the same package
        height = 10;
    }
}

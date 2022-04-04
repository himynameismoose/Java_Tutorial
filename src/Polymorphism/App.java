package Polymorphism;

public class App {
    public static void main(String[] args) {
        Plant plant1 = new Plant();
        Tree tree = new Tree();

        // Polymorphism
        // if there is a child class, you can use that anywhere the parent is being used

        Plant plant2 = tree;

        plant2.grow();

        tree.shedLeaves();

        doGrow(tree);
    }

    public static void doGrow(Plant plant) {
        plant.grow();
    }
}

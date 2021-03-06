package Tutorial44;

/** Enum **/
public class App {

//    public static final int DOG = 0;      // Don't need these anymore
//    public static final int CAT = 1;
//    public static final int MOUSE = 2;

    public static void main(String[] args) {
        // int animal = CAT;

//        switch (animal) {
//            case DOG:
//                System.out.println("Dog");
//                break;
//            case CAT:
//                System.out.println("Cat");
//                break;
//        }

        // instead of the above ---

        Animal animal = Animal.DOG;
        switch (animal) {
            case CAT:
                System.out.println("Cat");
                break;
            case DOG:
                System.out.println("Dog");
                break;
            case MOUSE:
                break;
            default:
                break;
        }

        System.out.println(Animal.DOG);
        System.out.println("Enum name as a string: " + Animal.DOG.name());
        System.out.println(Animal.DOG.getClass());
        System.out.println(Animal.DOG instanceof Enum);

        System.out.println(Animal.MOUSE.getName());

        Animal animal2 = Animal.valueOf("CAT");
        System.out.println(animal2);
    }
}

package Tutorial44;

public enum Animal {
    CAT("Fergus"), DOG("Fido"), MOUSE("Jerry");

    private String name;

    // you can give Enum types a constructor
    Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "This animal is called: " + name;
    }
}

package decorator;

public class BeagleDog extends Dog {
    private String name;
    private int age;
    private String breed;
    private String description;

    public BeagleDog  (String name, int age) {
        this.name = name;
        this.age = age;
        this.breed = "Beagle";
        description = "I am " + age + " years old " + breed + " dog named " + name + ".";
    }

    @Override
    public void activeAllBehaviours() {
    }

    public String getDescription() {
        return description;
    }
}

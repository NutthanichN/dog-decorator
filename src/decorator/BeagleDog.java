package decorator;

public class BeagleDog extends Dog {
    public BeagleDog (String name, int age) {
        super(name, age);
        this.breed = "Beagle";
    }

    @Override
    public String getDescription() {
        return "I am " + age + " years old " + breed + " dog named " + name + ".";
    }
}


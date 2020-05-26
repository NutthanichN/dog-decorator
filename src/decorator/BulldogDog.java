package decorator;

public class BulldogDog extends Dog {
    public BulldogDog (String name, int age) {
        super(name, age);
        this.breed = "Bulldogs";
    }

    @Override
    public String getDescription() {
        return "I am " + age + " years old " + breed + " dog named " + name + ".";
    }
}

package decorator;

public class AlaskanDog extends Dog {
    public AlaskanDog (String name, int age) {
        super(name, age);
        this.breed = "Alaskan Malamute";
    }

    @Override
    public String getDescription() {
        return "I am " + age + " years old " + breed + " dog named " + name + ".";
    }
}

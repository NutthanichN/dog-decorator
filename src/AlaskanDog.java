package decorator;

public class AlaskanDog extends Dog {
    private String name;
    private int age;
    private String breed;
    private String description;

    public AlaskanDog (String name, int age) {
        this.name = name;
        this.age = age;
        this.breed = "Alaskan Malamute";
        description = "I am " + age + " years old " + breed + " dog named " + name + ".";
    }

    @Override
    public void activeAllBehaviours() {
    }

    public String getDescription() {
        return description;
    }
}

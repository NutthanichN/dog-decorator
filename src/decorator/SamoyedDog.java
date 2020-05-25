package decorator;

public class SamoyedDog extends Dog {
    private String name;
    private int age;
    private String breed;
    private String description;

    public SamoyedDog (String name, int age) {
        this.name = name;
        this.age = age;
        this.breed = "Samoyed";
        description = "I am " + age + " years old " + breed + " dog named " + name + ".";
    }

    @Override
    public void activeAllBehaviours() {
    }

    public String getDescription() {
        return description;
    }
}

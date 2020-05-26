package decorator;

public class SamoyedDog extends Dog {
    public SamoyedDog (String name, int age) {
        super(name, age);
        this.breed = "Samoyed";
    }

    @Override
    public String getDescription() {
        return "I am " + age + " years old " + breed + " dog named " + name + ".";
    }
}



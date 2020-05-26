package decorator;

public class ChihuahuaDog extends Dog {
    public ChihuahuaDog (String name, int age) {
        super(name, age);
        this.breed = "Chihuahua";
    }

    @Override
    public String getDescription() {
        return "I am " + age + " years old " + breed + " dog named " + name + ".";
    }
}

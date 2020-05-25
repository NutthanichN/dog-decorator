public class ChihuahuaDog implements Dog {
    private String name;
    private String breed;
    private int age;

    public ChihuahuaDog (String name, int age) {
        this.name = name;
        this.breed = "Chihuahua";
        this.age = age;
    }

    @Override
    public void bark() {
        System.out.println("Bark");
    }

    @Override
    public void walk() {
        System.out.println("Walk");
    }

    @Override
    public void run() {
        System.out.println("Run");
    }

    @Override
    public void jump() {
        System.out.println("Jump");
    }

    @Override
    public void stand() {
        System.out.println("Stand");
    }

    @Override
    public void printBehaviours() {
        bark();
        walk();
        run();
        jump();
        stand();
    }

    @Override
    public String getDescription() {
        return "I am " + age + "years old " + breed + " dog named " + name + ".";
    }
}

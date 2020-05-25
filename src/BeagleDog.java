public class BeagleDog implements Dog {
    private String name;
    private String breed;
    private int age;

    public BeagleDog (String name, int age) {
        this.name = name;
        this.breed = "Beagle";
        this.age = age;
    }

    @Override
    public void bark() {
        System.out.println(breed + " Bark");
    }

    @Override
    public void walk() {
        System.out.println(breed + " Walk");
    }

    @Override
    public void run() {
        System.out.println(breed + " Run");
    }

    @Override
    public void jump() {
        System.out.println(breed + " Jump");
    }

    @Override
    public void stand() {
        System.out.println(breed + " Stand");
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

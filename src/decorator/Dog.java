package decorator;

public abstract class Dog {
    protected String name;
    protected int age;
    protected String breed;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public abstract String getDescription();

    public void bark() {
        System.out.println("Barking");
    }

    public void walk() {
        System.out.println("Walking");
    }

    public void run() {
        System.out.println("Running");
    }

    public void stand() {
        System.out.println("Standing");
    }

    public void sit() {
        System.out.println("Sitting");
    }

    public void sleep() {
        System.out.println("Sleeping");
    }
}

package decorator;

public class FastRunningDog extends DogDecorator {
    public FastRunningDog(Dog decoratedDog) {
        super(decoratedDog);
    }

    @Override
    public void run() {
        System.out.print("Fast ");
        decoratedDog.run();
    }

    @Override
    public void bark() {
        decoratedDog.bark();
    }

    @Override
    public void walk() {
        decoratedDog.walk();
    }

    @Override
    public void stand() {
        decoratedDog.stand();
    }

    @Override
    public void sit() {
        decoratedDog.sit();
    }

    @Override
    public void sleep() {
        decoratedDog.sleep();
    }

    @Override
    public String getDescription() {
        return decoratedDog.getDescription() + " Fast run";
    }
}


package decorator;

public class HappyWalkingDog extends DogDecorator {
    public HappyWalkingDog(Dog decoratedDog) {
        super(decoratedDog);
    }

    @Override
    public void walk() {
        System.out.print("Happy ");
        decoratedDog.walk();
    }

    @Override
    public void bark() {
        decoratedDog.bark();
    }

    @Override
    public void run() {
        decoratedDog.run();
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
        return decoratedDog.getDescription() + " Happily walk";
    }
}

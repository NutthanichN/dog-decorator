package decorator;

public class AngryBarkingDog extends DogDecorator {
    public AngryBarkingDog(Dog decoratedDog) {
        super(decoratedDog);
    }

    @Override
    public void bark() {
        System.out.print("Angry ");
        decoratedDog.bark();
    }

    @Override
    public void walk() {
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
        return decoratedDog.getDescription() + " Angrily bark";
    }
}
package decorator;

public class ChicStandingDog extends DogDecorator {
    public ChicStandingDog(Dog decoratedDog) {
        super(decoratedDog);
    }

    @Override
    public void stand() {
        System.out.print("Chic ");
        decoratedDog.stand();
    }

    @Override
    public void bark() { decoratedDog.bark(); }
    @Override
    public void walk() { decoratedDog.walk(); }
    @Override
    public void run() { decoratedDog.run(); }
    @Override
    public void sit() { decoratedDog.sit(); }
    @Override
    public void sleep() { decoratedDog.sleep(); }

    @Override
    public String getDescription() {
        return decoratedDog.getDescription() + " Chicly stand";
    }
}

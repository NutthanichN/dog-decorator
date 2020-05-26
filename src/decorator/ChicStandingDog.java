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
    public String getDescription() {
        return decoratedDog.getDescription() + " Chicly stand";
    }
}

package decorator;

public class StandingDog extends DogDecorator {
    private Dog decoratedDog;

    public StandingDog(Dog decoratedDog) {
        this.decoratedDog = decoratedDog;
    }


    @Override
    public String getDescription() {
        return decoratedDog.getDescription() + " Can stand.";
    }

    @Override
    public void activeAllBehaviours() {
        decoratedDog.activeAllBehaviours();
        stand();
    }

    public void stand() {
        System.out.println("Standing");
    }
}

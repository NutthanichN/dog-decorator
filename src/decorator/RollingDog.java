package decorator;

public class RollingDog extends DogDecorator {
    private Dog decoratedDog;

    public RollingDog(Dog decoratedDog) {
        this.decoratedDog = decoratedDog;
    }

    @Override
    public String getDescription() {
        return decoratedDog.getDescription() + " can roll";
    }

    @Override
    public void activeAllBehaviours() {
        decoratedDog.activeAllBehaviours();
        roll();
    }

    public void roll() {
        System.out.println("Rolling");
    }
}

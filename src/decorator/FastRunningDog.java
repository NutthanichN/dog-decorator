package decorator;

public class FastRunningDog extends DogDecorator {
    public FastRunningDog(Dog decoratedDog) {
        super(decoratedDog);
    }

    @Override
    public void walk() {
        System.out.print("Exciting ");
        decoratedDog.walk();
    }

    @Override
    public String getDescription() {
        return decoratedDog.getDescription() + " Excitedly run";
    }
}

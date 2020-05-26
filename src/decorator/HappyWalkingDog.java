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
    public String getDescription() {
        return decoratedDog.getDescription() + " Happily walk";
    }
}

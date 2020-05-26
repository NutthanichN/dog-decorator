package decorator;

public class AngryBarkingDog extends DogDecorator {
    public AngryBarkingDog(Dog decoratedDog) {
        super(decoratedDog);
    }

    @Override
    public void walk() {
        System.out.print("Angry ");
        decoratedDog.walk();
    }

    @Override
    public String getDescription() {
        return decoratedDog.getDescription() + " Angrily bark";
    }
}

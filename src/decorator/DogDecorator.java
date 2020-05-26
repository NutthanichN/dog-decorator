package decorator;

public abstract class DogDecorator extends Dog{
    protected Dog decoratedDog;

    public DogDecorator(Dog decoratedDog) {
        super(decoratedDog.name, decoratedDog.age);
        this.decoratedDog = decoratedDog;
    }

    public String getDescription() {
        return decoratedDog.getDescription();
    }
}

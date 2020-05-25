package decorator;

public class DancingDog extends DogDecorator {
    private Dog decoratedDog;

    public DancingDog(Dog decoratedDog) {
        this.decoratedDog = decoratedDog;
    }

    @Override
    public void activeAllBehaviours() {
        decoratedDog.activeAllBehaviours();
        dance();

    }

    public void dance() {
        System.out.println("Dancing");
//        description = " can dance";
    }

    @Override
    public String getDescription() {
        return decoratedDog.getDescription() + " Can dance.";
    }

}

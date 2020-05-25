package decorator;

public class RunningDog extends DogDecorator {
    private Dog decoratedDog;

    public RunningDog(Dog decoratedDog) {
        this.decoratedDog = decoratedDog;
    }

    @Override
    public String getDescription() {
        return decoratedDog.getDescription() + " Can run.";
    }

    @Override
    public void activeAllBehaviours() {
        decoratedDog.activeAllBehaviours();
        run();
    }

    public void run() {
        System.out.println("Running");
    }
}

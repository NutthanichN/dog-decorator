package decorator;

public class PlayingDeadDog extends DogDecorator {
    private Dog decoratedDog;

    public PlayingDeadDog(Dog decoratedDog) {
        this.decoratedDog = decoratedDog;
    }

    @Override
    public String getDescription() {
        return decoratedDog.getDescription() + " Can play dead.";
    }

    @Override
    public void activeAllBehaviours() {
        decoratedDog.activeAllBehaviours();
        playingDead();
    }

    public void playingDead() {
        System.out.println("Playing Dead");
    }
}

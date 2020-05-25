package decorator;

public class Main {
    public static void main(String[] args) {
        Dog c = new ChihuahuaDog("Dukdik", 10);
        System.out.println(c.getDescription());
        c.activeAllBehaviours();

        System.out.println();

        c = new DancingDog(c);
        System.out.println(c.getDescription());
        c.activeAllBehaviours();

        System.out.println();

        c = new RunningDog(c);
        System.out.println(c.getDescription());
        c.activeAllBehaviours();

        System.out.println();

        c = new PlayingDeadDog(c);
        System.out.println(c.getDescription());
        c.activeAllBehaviours();

        System.out.println();

        c = new StandingDog(c);
        System.out.println(c.getDescription());
        c.activeAllBehaviours();
    }
}

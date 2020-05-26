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

        Dog be = new BeagleDog("JackJack", 7);
        System.out.println(be.getDescription());
        be.activeAllBehaviours();

        System.out.println();

        be = new DancingDog(be);
        System.out.println(be.getDescription());
        be.activeAllBehaviours();

        System.out.println();

        be = new RunningDog(be);
        System.out.println(be.getDescription());
        be.activeAllBehaviours();

        System.out.println();

        be = new PlayingDeadDog(be);
        System.out.println(be.getDescription());
        be.activeAllBehaviours();

        System.out.println();

        be = new StandingDog(be);
        System.out.println(be.getDescription());
        be.activeAllBehaviours();

        Dog s = new SamoyedDog("Daniel", 3);
        System.out.println(s.getDescription());
        s.activeAllBehaviours();

        System.out.println();

        s = new DancingDog(s);
        System.out.println(s.getDescription());
        s.activeAllBehaviours();

        System.out.println();

        s = new RunningDog(s);
        System.out.println(s.getDescription());
        s.activeAllBehaviours();

        System.out.println();

        s = new PlayingDeadDog(s);
        System.out.println(s.getDescription());
        s.activeAllBehaviours();

        System.out.println();

        s = new StandingDog(s);
        System.out.println(s.getDescription());
        s.activeAllBehaviours();
    }
}

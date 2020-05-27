package decorator;

public class Main {
    public static void main(String[] args) {
        Dog c = new ChihuahuaDog("Dukdik", 10);
        Dog be = new BeagleDog("JackJack", 7);
//        Dog bu = new BulldogDog("Marry", 4);
//        Dog s = new SamoyedDog("Daniel", 3);
//        Dog a = new AlaskanDog("Bob", 1);

        System.out.println(c.getDescription());
        c.walk();
        c.stand();
        System.out.println("---------------------------");

        c = new ChicStandingDog(c);
        c = new HappyWalkingDog(c);
        System.out.println(c.getDescription());
        c.walk();
        c.stand();

//        System.out.println(be.getDescription());
//        be.run();
//        System.out.println("---------------------------");
//        be = new FastRunningDog(be);
//        System.out.println(be.getDescription());
//        be.run();

    }
}

package decorator;

public class Main {
    public static void main(String[] args) {
        Dog c = new ChihuahuaDog("Dukdik", 10);
//        Dog be = new BeagleDog("JackJack", 7);
//        Dog s = new SamoyedDog("Daniel", 3);

        System.out.println(c.getDescription());
        c.walk();

        c = new ChicStandingDog(c);
        c = new HappyWalkingDog(c);
        System.out.println(c.getDescription());
        c.walk();
        c.stand();


//        c = new ExcitingRunningDog(c);
//        System.out.println(c.getDescription());

    }
}

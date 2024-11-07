package wk9;

public class Week9 {

    public static void main(String[] args) {

        Human h1 = new SuperHero();

        System.out.println(h1); //

        Human[] humans = {new Human(), new SuperHero()};
        Object[] objects = {1, "hi", false};

    }

    static void example1(){

        Human bruce = new Human("Bruce Wayne", 40, 70d);
        System.out.println(bruce);
        bruce.setAge(45);
        System.out.println(bruce.jump());
        System.out.println(bruce.fight());

        SuperHero batman = new SuperHero("Bruce Wayne", 40, 70d);

        System.out.println(batman);


    }
}

package wk9;

public class SuperHero extends Human{
    public String heroName, power, enemy;
    public double strikePower;

    public SuperHero(){
        super();
    }
    public SuperHero(String name, int age,
                     double height){

//        this.name = name;
//        this.height = height;
//        setAge(age);
        //int i = 0; // super() needs to be first statement
        super(name, age, height);


    }

    public SuperHero(String name, int age,
                     double height, String heroName,
                     String power, String enemy,
                     double strikePower){

        //this(name, age, height);
        super(name, age, height);
        this.heroName = heroName;
        this.power = power;
        this.strikePower = strikePower;
        this.enemy = enemy;

    }

    @Override
    public String toString(){

        return super.toString().replace("Human", "SuperHero")
                .replace("}", ",")  + String.format(
                        "heroName=%s, power=%s, enemy=%s, strikePower=%.1f",
                heroName, power, enemy, strikePower
        ) + "}";
    }

    @Override
    public String fight(){
        return heroName + " is fighting " + enemy;
    }

}

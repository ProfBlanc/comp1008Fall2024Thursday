package wk9;

public class Human {

    public String name;
    private int age;
    protected double height;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Human(){}

    public Human(String name, int age, double height){

        this.name = name;
        this.height = height;
        setAge(age);

    }

    @Override  //annotation: compiler checks Super class. ensures that this method signature exists in super class(es)
    public String toString() {

        return "Human{" + "name=" + name +
                ", age=" + age +
                ", height=" + height + '}';
    }

    public String jump(){

        return String.format("%s is jumping at a height of %.1f",
                name, height/3);
    }

    public String fight(){

        return name + "is running away from a fight";
    }

}

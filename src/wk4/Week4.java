package wk4;

import java.util.ArrayList;
public class Week4 {


    public static void main(String[] args) {

        example2();

    }
    static void example2(){

        Person p1 = new Person();
        p1.setAge((byte)50);
        System.out.println(p1.getAge());
        p1.name = "Person";
        System.out.println(p1.name);

        p1.setAge((byte) -100);
        System.out.println(p1.getAge());
    }
    static void example1(){

        ArrayList<String> watches = new ArrayList<String>();

        watches.add("patek");
        watches.add("suiss");
        watches.add("rolex");
        watches.add(1, "timex");

        watches.set(2, "suiss-suiss");
      String removedValue= watches.remove(0); //bye, bye patek
        boolean result = watches.remove("timex");

        boolean isFound = watches.contains("omega");
        int indexOfRolex = watches.indexOf("rolex");


        /*
                0           1             2        3
                patek       timex        suiss    rolex



         */

    }
}

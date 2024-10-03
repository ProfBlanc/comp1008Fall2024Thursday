package wk5;

public class Week5 {

    public static void main(String[] args) {
        /*
                StringBuilder
                StringBuffer
         */
        //capacity = max size  = soft => expandable how? add 1 + double

        StringBuilder sb1 = new StringBuilder(); //length = # chars = 0, capacity = 16
        StringBuilder sb2 = new StringBuilder(20); // length = , capacity = 20
        StringBuilder sb3 = new StringBuilder("Hello World");  //length = 11, capacity = 27

        System.out.println();

        sb1.append(1234);
        sb1.append(true);  //"1234true"
        //what is the LENGTH of sb1
        System.out.println(sb1.length());
        System.out.println(sb1.capacity());
        sb1.append("Ben Blanc"); //"1234trueBen Blanc"
        System.out.println("*".repeat(20));
        System.out.println(sb1.length());
        System.out.println(sb1.capacity());

        sb1.insert(1, "987"); //"1987234BenBlanc"
        System.out.println(sb1);
        String s1 = sb1.toString();

        sb1.delete(3, 6);
        System.out.println(sb1);



    }

    static void example2(){
        String s1 = "hi";
        s1 = "hello";

        String s2 = new String();
        String s3 = new String("hi".toCharArray());
        String s4 = new String("hello world");

        //System.out.println(s3[0]);
        System.out.println(s3.charAt(0));

    }
    static void example1(){

        Car car = new Car();
        car.setEngineSizev3("V7");

    }

}

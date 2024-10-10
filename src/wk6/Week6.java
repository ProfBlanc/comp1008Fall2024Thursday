package wk6;

import java.util.Scanner;

public class Week6 {

    public static void main(String[] args) {
        example4();
    }
    static void example4(){
        example5();
    }
    static void example5(){
        System.out.println("Hello");
        Integer.parseInt("abc");
    }
    static void example3(){

        System.out.println("Enter an odd number");
        Scanner sc = new Scanner(System.in);
        int num = 0;
        try {
            num = sc.nextInt();
            System.out.println("The number you entered was " + num);

            if(num % 2 == 0){
                throw new IllegalArgumentException(num + " is not odd!");
            }

            System.out.println("Thank you for entering an odd number");

        }
        catch (IllegalArgumentException e){
            System.err.println(e.getMessage());
        }
        catch (Exception e){
            //System error
            System.err.println("Invalid number");
        }
        finally {
            System.out.println("Thanks for using the program");
        }

    }
    static void example2(){

        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num = 0;
try {
     num = sc.nextInt();
    System.out.println("The number you entered was " + num);
}
catch (Exception e){
    //System error
    System.err.println("Invalid number");
}
finally {
    sc = null;
}
        System.out.println(num);

    }
    static void example1(){

        Person p = new Person();

        String s1 = "";

        p.getName();

        p.setName("hello world");

        //Integer.parseInt("abc");

        new Scanner(System.in).nextInt();

    }

}

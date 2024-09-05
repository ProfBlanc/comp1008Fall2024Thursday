package wk1;

import java.util.Scanner;

public class Week1 {

    public static void main(String[] args) {
        /*
                Ask the user for their name and birth year
                Greet the user: "Hello {name}"
                Tell the user their age: "You are {currentYear - birthYear} years old"
         */
        int currentYear = 2024;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = input.nextLine();

        System.out.println("Enter your birth year");
        int birthYear = input.nextInt();

        System.out.println("Hello, " + name);
        System.out.println("You are " + (currentYear - birthYear) + " years old" );

    }

}

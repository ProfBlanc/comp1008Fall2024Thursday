package wk1;

import java.util.Scanner;

public class Week1Task1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();
        System.out.println("Sum = " + (num1 + num2) );
        System.out.println("Product = " + (num1 * num2) );
    }
}

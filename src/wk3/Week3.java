package wk3;

import java.util.Random;
import java.util.Scanner;

public class Week3 {

    //psvm+tab
    public static void main(String[] args) {

       // additionStorm();
        divisionStorm();

    }
    static void typecasting(){

        byte a = 10;
        int b = a;
        //a whole number is implicitly (by default) an int
        //a decimal number is implicitly a double

        long c = b;

        short d = (short)b;

        int e = 130;
        //byte -128                 0                       127

        byte f = (byte)e; //overflows to the next bound (max value)
        System.out.println(f);

        /*
        int         127     128     129     130
        byte        127     -128    -127    -126

         */


    }
    static void workingWithArrays(){

        int[] nums1 = new int[5];

        for(int n : nums1){
            System.out.println(n);
        }

        int[] num2 = {1, 10, -10 };

        int numberOfElements = num2.length;


        int firstItem = num2[0];

        Object[] objects = {true, 1.1, 2, "hello"};



    }

    static void divisionStorm(){

        /*
                Ask the user to divide two, two-digits numbers
                Ask the user 5 questions
                Storm their answers. Store the equation question & answer
                Each time, give congrats message or correct answer.
         */

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int minOperandNumber = 10, maxOperandNumber = 99;
        int numberOfQuestionsToAnswer = 5;
        Object[] correctAnswers = new Object[numberOfQuestionsToAnswer];
        String[] equations = new String[numberOfQuestionsToAnswer];
        double[] userAnswers = new double[numberOfQuestionsToAnswer];
        double operand1, operand2, userInput;
        System.out.println("Please input a number with a maximum precision of 2 (max two decimal places)");
        for(int i = 0; i < numberOfQuestionsToAnswer; i++){

            operand1 = rand.nextInt(minOperandNumber, maxOperandNumber);
            operand2 = rand.nextInt(minOperandNumber, maxOperandNumber);

            if(  (operand1 / operand2) % 10 == 0   ){
                correctAnswers[i] = (int)(operand1/operand2);
            }
            else{
                correctAnswers[i] = (double) Math.round( (operand1/operand2) * 100 ) / 100;
            }
            String equation = String.format("%.0f / %d = ? ", operand1, (int)operand2);

            //System.out.printf("%.0f / %d = ? ", operand1, (int)operand2);
            System.out.println(equation);
            userInput = sc.nextDouble();
            userAnswers[i] = userInput;
            equations[i] = equation;

//            if(userInput == (double)correctAnswers[i]){
//                System.out.println("Correct!");
//            }
//            else{
//                System.out.println("Incorrect!");
//            }
            System.out.println((double) correctAnswers[i] == userInput ? "correct" : "incorrect");
        }

        System.out.println("End of program");

    }
    static void additionStorm(){
        /*
                Continually ask user to answer
                an addition equation
                until the user correctly answers
                5 questions
         */

        //Scanner objet = user input
        // var to store userInput
        // var to store correct answer
        // count numberOfCorrectAnswers
        // if statement to determine if number is correct
        // loop to ask (while)
        // var to store numberOfQuestionsToAsk
        // randomly generate two operands (numbers to ask)

        //declare & initialize variables
        //declaration
        Scanner input;
        int userInput, correctAnswer, numberOfCorrectAnswers,
        numberOfQuestionsToAsk, num1, num2;
        Random random = new Random();

        //initialize
        input = new Scanner(System.in);
        numberOfCorrectAnswers = 0;
        numberOfQuestionsToAsk = 5;

        System.out.printf("We will ask you addition questions" +
                " until you answer %d correct answers\n",
                numberOfQuestionsToAsk);
        do{
            num1 = random.nextInt(1,11);
            num2 = random.nextInt(1,11);
            correctAnswer = num1 + num2;

            System.out.printf("%d + %d = ? ",
                    num1, num2);
            userInput = input.nextInt();

            if(userInput == correctAnswer){
                System.out.println("Correct");
                numberOfCorrectAnswers++;
            }
            else{
                System.out.println("Incorrect. The answer was " + correctAnswer);
            }
        }
        while(numberOfCorrectAnswers < numberOfQuestionsToAsk);



    }

}

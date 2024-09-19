package wk3;

import java.util.Random;
import java.util.Scanner;

public class Week3 {

    //psvm+tab
    public static void main(String[] args) {

        additionStorm();

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

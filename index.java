import java.util.Random;
import java.util.Scanner; // Import the Scanner class
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int upperBound = 100;
        int NumberToGuess = rand.nextInt(upperBound);
        boolean isCorrect = false;
        Scanner myObj = new Scanner(System.in); // Create a Scanner object
        try {
            FileWriter x = new FileWriter("Guess.txt");
            x.write("the answer is " + NumberToGuess);
            x.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        while (!isCorrect) {
           
            System.out.println("Guess a number between 0 and 100");
            int number = myObj.nextInt(); // Read user input
            if (number == NumberToGuess ) isCorrect = true;
            else if (number < NumberToGuess ) 
                System.out.println("Number is less then the number to be guessed");
            else 
                System.out.println("Number is higher then the number to be guessed");
          
        }
        System.out.println("You Guessed the number ");

        myObj.close();
        

    
    }
}
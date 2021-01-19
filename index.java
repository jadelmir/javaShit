import java.util.Random;
import java.util.Scanner; // Import the Scanner class

class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int upperBound = 100;
        int NumberToGuess = rand.nextInt(upperBound);
        boolean isCorrect = false;
        Scanner myObj = new Scanner(System.in); // Create a Scanner object
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
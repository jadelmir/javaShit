import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



class Ex1 {
    public static void main(String[] args) {
        int input = -1;
        int sum = 0 ;
        Scanner myObj = new Scanner(System.in); // Create a Scanner object

        while(input != 0){
        System.out.println("Enter an integer");
        input = myObj.nextInt(); // Read user input
        sum += input ;
        }
        try{
        FileWriter file = new FileWriter("Total.txt");
        file.write("the sum is: "+sum);
        file.close();
        }catch(IOException e){
        e.printStackTrace();
        }
        myObj.close();

    }
}
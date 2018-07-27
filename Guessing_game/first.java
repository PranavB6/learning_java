import java.util.Random;
import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        System.out.println("Initialized");

        Scanner reader = new Scanner(System.in);  // Reading from System.in

        Random rand_obj = new Random();
        int rand = rand_obj.nextInt(100) + 1;
        int guess;

        System.out.println("Guess my number between 1 and 100");
        System.out.println(rand);

        do {
        System.out.print("Guess: ");
        guess = reader.nextInt(); // Scans the next token of the input as an int.
        System.out.println("");
    
        if (guess > rand) { System.out.println("You High"); }
        else if (guess < rand) { System.out.println("Too Low"); }
        System.out.println("");

        } while(guess != rand);

        reader.close();

        System.out.println();
    }
}
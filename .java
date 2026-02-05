import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int score = 0;
        char playAgain;

        do {
            // Generate random number between 1 and 100
            int number = rand.nextInt(100) + 1;
            int attempts = 5;

            System.out.println("\nGuess the number between 1 and 100");
            System.out.println("You have " + attempts + " attempts");

            while (attempts > 0) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();

                if (guess == number) {
                    System.out.println("Correct! You won this round 🎉");
                    score++;
                    break;
                } else if (guess > number) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Too low!");
                }

                attempts--;
                System.out.println("Attempts left: " + attempts);
            }

            if (attempts == 0) {
                System.out.println("Game Over! Number was: " + number);
            }

            // Display score
            System.out.println("Current Score: " + score);

            System.out.print("Play again? (y/n): ");
            playAgain = sc.next().charAt(0);

        } while (playAgain == 'y' || playAgain == 'Y');

        System.out.println("\nFinal Score: " + score);
        sc.close();
    }
}

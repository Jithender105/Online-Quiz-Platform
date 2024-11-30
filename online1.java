import java.util.Scanner;

public class online1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("Welcome to the Online Quiz Platform!");
        System.out.println("Please answer the following questions by selecting the correct option (1, 2, 3, or 4).\n");

        // Question 1
        System.out.println("1. What is the capital of France?");
        System.out.println("1. Berlin");
        System.out.println("2. Paris");
        System.out.println("3. Madrid");
        System.out.println("4. Rome");
        int answer1 = scanner.nextInt();
        if (answer1 == 2) {
            score++;
        }

        // Question 2
        System.out.println("2. Who wrote 'To Kill a Mockingbird'?");
        System.out.println("1. Harper Lee");
        System.out.println("2. J.K. Rowling");
        System.out.println("3. Mark Twain");
        System.out.println("4. Charles Dickens");
        int answer2 = scanner.nextInt();
        if (answer2 == 1) {
            score++;
        }

        // Question 3
        System.out.println("3. What is the largest planet in our solar system?");
        System.out.println("1. Earth");
        System.out.println("2. Mars");
        System.out.println("3. Jupiter");
        System.out.println("4. Saturn");
        int answer3 = scanner.nextInt();
        if (answer3 == 3) {
            score++;
        }

        System.out.println("\nQuiz Completed!");
        System.out.println("Your score: " + score + " out of 3");

        scanner.close();
    }
}

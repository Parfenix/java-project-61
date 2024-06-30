package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_COUNT = 3;

    public static void runGame(String gameDescription, String[][] roundsData) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String username = scanner.nextLine();
        System.out.println("Hello, " + username + "!");
        System.out.println(gameDescription);

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            System.out.println("Question: " + roundsData[i][0]);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();
            String correctAnswer = roundsData[i][1];

            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. "
                        + "Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + username + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + username + "!");
    }
}

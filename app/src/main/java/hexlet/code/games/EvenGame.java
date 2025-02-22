package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class EvenGame {
    public static void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String username = scanner.nextLine();
        System.out.println("Hello, " + username + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        Random random = new Random();
        int round = 0;

        while (round < Engine.ROUNDS_COUNT) {
            int number = random.nextInt(Engine.NUMBER_LIMIT);
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();
            String correctAnswer = number % 2 == 0 ? "yes" : "no";

            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");
                round++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                break;
            }
        }

        String win = "Congratulations, " + username + "!";
        String lose = "Let's try again, " + username + "!";
        String outro = round == Engine.ROUNDS_COUNT ? win : lose;

        System.out.println(outro);
    }
}

package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class GcdGame {
    private static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";

    public static void start() {
        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];
        Random random = new Random();
        int limit = 100;

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int num1 = random.nextInt(limit) + 1;
            int num2 = random.nextInt(limit) + 1;

            String question = num1 + " " + num2;
            String answer = String.valueOf(gcd(num1, num2));

            roundsData[i][0] = question;
            roundsData[i][1] = answer;
        }

        Engine.runGame(DESCRIPTION, roundsData);
    }

    private static int gcd(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }

        return num1;
    }
}

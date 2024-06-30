package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class CalcGame {
    private static final String DESCRIPTION = "What is the result of the expression?";
    private static final char[] OPERATORS = {'+', '-', '*'};

    public static void start() throws IllegalAccessException {
        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];
        Random random = new Random();

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int num1 = random.nextInt(100);
            int num2 = random.nextInt(100);
            char operator = OPERATORS[random.nextInt(OPERATORS.length)];

            String question = num1 + " " + operator + " " + num2;
            String answer = String.valueOf(calculate(num1, num2, operator));

            roundsData[i][0] = question;
            roundsData[i][1] = answer;
        }

        Engine.runGame(DESCRIPTION, roundsData);
    }

    private static int calculate(int num1, int num2, char operator) throws IllegalAccessException {
        return switch (operator) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            default -> throw new IllegalAccessException("Unexpected value: " + operator);
        };
    }
}

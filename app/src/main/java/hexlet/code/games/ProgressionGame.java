package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class ProgressionGame {
    private static final String DESCRIPTION = "What number is missing in the progression?";
    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 10;

    public static void start() {
        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];
        Random random = new Random();
        int numberLimit = 100;
        int progressionLimit = 10;

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int progressionLength = random.nextInt(MAX_LENGTH - MIN_LENGTH + 1) + MIN_LENGTH;
            int start = random.nextInt(numberLimit);
            int step = random.nextInt(progressionLimit) + 1;
            int hiddenIndex = random.nextInt(progressionLength);

            int[] progression = generateProgression(start, step, progressionLength);
            String question = generateQuestion(progression, hiddenIndex);
            String answer = String.valueOf(progression[hiddenIndex]);

            roundsData[i][0] = question;
            roundsData[i][1] = answer;
        }

        Engine.runGame(DESCRIPTION, roundsData);
    }

    private static int[] generateProgression(int start, int step, int length) {
        int[] progression = new int[length];

        for (int i = 0; i < length; i++) {
            progression[i] = start + i * step;
        }

        return progression;
    }

    private static String generateQuestion(int[] progression, int hiddenIndex) {
        StringBuilder question = new StringBuilder();

        for (int i = 0; i < progression.length; i++) {
            if (i == hiddenIndex) {
                question.append(".. ");
            } else {
                question.append(progression[i]).append(" ");
            }
        }

        return question.toString().trim();
    }
}

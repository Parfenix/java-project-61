package hexlet.code;

import hexlet.code.games.EvenGame;
import hexlet.code.games.CalcGame;
import hexlet.code.games.GcdGame;
import hexlet.code.games.ProgressionGame;
import hexlet.code.games.PrimeGame;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IllegalAccessException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        String choice = scanner.nextLine();

        switch (choice) {
            case "1":
                Cli.greetUser();
                break;
            case "2":
                EvenGame.start();
                break;
            case "3":
                CalcGame.start();
                break;
            case "4":
                GcdGame.start();
                break;
            case "5":
                ProgressionGame.start();
                break;
            case "6":
                PrimeGame.start();
                break;
            case "0":
                System.out.println("Goodbye!");
                break;
            default:
                System.out.println("Invalid choice. Please enter a valid game number.");
                break;
        }
    }
}

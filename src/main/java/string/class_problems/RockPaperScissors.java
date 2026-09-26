package string.class_problems;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static String playRound(String playerMove, String computerMove) {
        if (playerMove.equals(computerMove)) {
            return "Draw";
        }

        if ((playerMove.equals("rock") && computerMove.equals("scissors")) ||
                (playerMove.equals("paper") && computerMove.equals("rock")) ||
                (playerMove.equals("scissors") && computerMove.equals("paper"))) {
            return "Player Wins";
        }

        return "Computer Wins";
    }

    public static String getComputerMove() {
        Random random = new Random();
        int choice = random.nextInt(3);

        if (choice == 0) {
            return "rock";
        } else if (choice == 1) {
            return "paper";
        } else {
            return "scissors";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rounds: ");
        int rounds = scanner.nextInt();

        int wins = 0;
        int losses = 0;
        int draws = 0;

        for (int i = 1; i <= rounds; i++) {
            System.out.println("\nRound " + i);
            System.out.print("Enter rock, paper, or scissors: ");

            String playerMove = scanner.next().toLowerCase();
            String computerMove = getComputerMove();

            System.out.println("Computer chose: " + computerMove);

            String result = playRound(playerMove, computerMove);
            System.out.println("Result: " + result);

            if (result.equals("Player Wins")) {
                wins++;
            } else if (result.equals("Computer Wins")) {
                losses++;
            } else {
                draws++;
            }
        }

        double winPercentage = (double) wins / rounds * 100;

        System.out.println("\n===== GAME SUMMARY =====");
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        System.out.println("Draws: " + draws);
        System.out.printf("Win Percentage: %.2f%%%n", winPercentage);

        scanner.close();
    }
}
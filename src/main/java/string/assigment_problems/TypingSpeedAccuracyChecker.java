package string.assigment_problems;

import java.util.Scanner;

public class TypingSpeedAccuracyChecker {

    public static void checkTypingAccuracy(String original, String typed) {

        int total = original.length();
        int matched = 0;
        int firstMismatch = -1;

        int length = Math.min(original.length(), typed.length());

        for (int i = 0; i < length; i++) {

            if (original.charAt(i) == typed.charAt(i)) {
                matched++;
            } else if (firstMismatch == -1) {
                firstMismatch = i + 1;
            }
        }

        if (firstMismatch == -1 && original.length() != typed.length()) {
            firstMismatch = length + 1;
        }

        double accuracy = (double) matched / total * 100;

        System.out.println("Matched characters: " + matched);
        System.out.printf("Accuracy: %.2f%%%n", accuracy);

        if (firstMismatch == -1) {
            System.out.println("No mismatch found.");
        } else {
            System.out.println("First mismatch position: " + firstMismatch);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter original text: ");
        String original = scanner.nextLine();

        System.out.print("Enter typed text: ");
        String typed = scanner.nextLine();

        checkTypingAccuracy(original, typed);

        scanner.close();
    }
}
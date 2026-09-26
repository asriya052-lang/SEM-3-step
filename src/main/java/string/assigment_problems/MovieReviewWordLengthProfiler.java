package string.assigment_problems;

import java.util.Scanner;

public class MovieReviewWordLengthProfiler {

    public static void classifyWordLengths(String review) {

        String[] words = review.split("\\s+");

        int shortWords = 0;
        int mediumWords = 0;
        int longWords = 0;

        for (String word : words) {

            word = word.replaceAll("[^a-zA-Z]", "");

            if (word.length() >= 1 && word.length() <= 4) {
                shortWords++;
            } else if (word.length() >= 5 && word.length() <= 8) {
                mediumWords++;
            } else if (word.length() >= 9) {
                longWords++;
            }
        }

        System.out.println("Short words (1-4): " + shortWords);
        System.out.println("Medium words (5-8): " + mediumWords);
        System.out.println("Long words (9+): " + longWords);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the movie review:");
        String review = scanner.nextLine();

        classifyWordLengths(review);

        scanner.close();
    }
}
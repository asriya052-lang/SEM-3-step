package string.class_problems;

import java.util.Scanner;

public class BmiCalculator {

    public static String getBmiStatus(double bmi) {

        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void printWellnessReport(double[] heights, double[] weights) {

        for (int i = 0; i < heights.length; i++) {

            double bmi = weights[i] / (heights[i] * heights[i]);

            System.out.printf(
                    "Person %d - BMI: %.2f - Status: %s%n",
                    i + 1,
                    bmi,
                    getBmiStatus(bmi)
            );
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of people: ");
        int n = scanner.nextInt();

        double[] heights = new double[n];
        double[] weights = new double[n];

        for (int i = 0; i < n; i++) {

            System.out.print("Enter height in meters for person "
                    + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();

            System.out.print("Enter weight in kilograms for person "
                    + (i + 1) + ": ");
            weights[i] = scanner.nextDouble();
        }

        printWellnessReport(heights, weights);

        scanner.close();
    }
}
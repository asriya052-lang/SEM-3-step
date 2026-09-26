package string.assigment_problems;

import java.util.Scanner;

public class WarehouseInventoryBalancer {

    public static void analyzeInventory(int[] sectionA, int[] sectionB) {

        int totalA = 0;
        int totalB = 0;

        int highestQuantity = sectionA[0];
        String highestSection = "Section A";
        int highestItem = 1;

        for (int i = 0; i < sectionA.length; i++) {

            totalA += sectionA[i];
            totalB += sectionB[i];

            if (sectionA[i] > highestQuantity) {
                highestQuantity = sectionA[i];
                highestSection = "Section A";
                highestItem = i + 1;
            }

            if (sectionB[i] > highestQuantity) {
                highestQuantity = sectionB[i];
                highestSection = "Section B";
                highestItem = i + 1;
            }
        }

        System.out.println("Total Section A: " + totalA);
        System.out.println("Total Section B: " + totalB);

        if (totalA == totalB) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }

        System.out.println("Highest quantity: " + highestQuantity);
        System.out.println("Highest quantity is in " + highestSection
                + ", Item " + highestItem);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = scanner.nextInt();

        int[] sectionA = new int[n];
        int[] sectionB = new int[n];

        System.out.println("Enter quantities for Section A:");

        for (int i = 0; i < n; i++) {
            sectionA[i] = scanner.nextInt();
        }

        System.out.println("Enter quantities for Section B:");

        for (int i = 0; i < n; i++) {
            sectionB[i] = scanner.nextInt();
        }

        analyzeInventory(sectionA, sectionB);

        scanner.close();
    }
}
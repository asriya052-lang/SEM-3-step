package oop.assigment_problems;

public class Payment {

    public void pay(double amount) {
        System.out.println("Paid (cash): Rs " + amount);
    }

    public double getChargedAmount(double amount) {
        return amount;
    }

    public static class CardPayment extends Payment {

        public void payWithProcessingFee(double amount) {
            double total = amount + (amount * 0.02);
            System.out.println("Charged (card, incl. fee): Rs " + total);
        }

        @Override
        public double getChargedAmount(double amount) {
            return amount + (amount * 0.02);
        }
    }

    public void processTransaction(Payment payment, double amount) {

        if (payment instanceof CardPayment) {
            CardPayment cardPayment = (CardPayment) payment;
            cardPayment.payWithProcessingFee(amount);
        } else {
            payment.pay(amount);
        }
    }

    public static void main(String[] args) {

        Payment[] payments = {
                new CardPayment(),
                new Payment(),
                new CardPayment(),
                new Payment(),
                new CardPayment()
        };

        double[] amounts = {
                100, 50, 200, 75, 120
        };

        Payment processor = new Payment();

        double totalCollected = 0;

        for (int i = 0; i < payments.length; i++) {

            processor.processTransaction(payments[i], amounts[i]);

            totalCollected += payments[i].getChargedAmount(amounts[i]);
        }

        System.out.println("Total Collected: Rs " + totalCollected);
    }
}
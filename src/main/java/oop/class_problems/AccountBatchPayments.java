package oop.class_problems;

public class AccountBatchPayments {

    static int hostelCount = 0;
    static int dayScholarCount = 0;

    static class FeeAccount {
        String accountType;

        public FeeAccount(String accountType) {
            this.accountType = accountType;
        }
    }

    static class HostelFeeAccount extends FeeAccount {

        public HostelFeeAccount() {
            super("Hostel");
        }
    }

    public void processPayment(FeeAccount account, double amount) {

        if (account instanceof HostelFeeAccount) {
            System.out.println("Paid in two installments (hostel account)");
            hostelCount++;
        } else {
            System.out.println("Paid in one go (day-scholar account)");
            dayScholarCount++;
        }
    }

    public static void main(String[] args) {

        FeeAccount[] accounts = {
                new HostelFeeAccount(),
                new HostelFeeAccount(),
                new FeeAccount("Day-Scholar"),
                new FeeAccount("Day-Scholar")
        };

        AccountBatchPayments processor = new AccountBatchPayments();

        for (FeeAccount account : accounts) {
            processor.processPayment(account, 60000);
        }

        System.out.println("Hostel accounts processed: " + hostelCount
                + " | Day-scholar accounts processed: " + dayScholarCount);
    }
}
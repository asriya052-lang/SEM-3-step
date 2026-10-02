package system_design.assigment_problems;

public class BankTransferPayment implements PaymentMethod {

    @Override
    public boolean processPayment(Order order) {

        System.out.println(
                "Processing Bank Transfer payment..."
        );

        return true;
    }

    @Override
    public String getPaymentMethodName() {
        return "Bank Transfer";
    }
}
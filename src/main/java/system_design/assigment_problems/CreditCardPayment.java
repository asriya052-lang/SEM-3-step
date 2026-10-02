package system_design.assigment_problems;

public class CreditCardPayment implements PaymentMethod {

    @Override
    public boolean processPayment(Order order) {

        System.out.println(
                "Processing Credit Card payment..."
        );

        return true;
    }

    @Override
    public String getPaymentMethodName() {
        return "Credit Card";
    }
}
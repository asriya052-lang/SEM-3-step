package system_design.assigment_problems;

public class PayPalPayment implements PaymentMethod {

    private boolean paymentSuccessful;

    public PayPalPayment(boolean paymentSuccessful) {
        this.paymentSuccessful = paymentSuccessful;
    }

    @Override
    public boolean processPayment(Order order) {

        System.out.println(
                "Processing PayPal payment..."
        );

        return paymentSuccessful;
    }

    @Override
    public String getPaymentMethodName() {
        return "PayPal";
    }
}
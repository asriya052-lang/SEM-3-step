package system_design.assigment_problems;

public interface PaymentMethod {

    boolean processPayment(Order order);

    String getPaymentMethodName();
}
package system_design.assigment_problems;

public class PaymentProcessor {

    public boolean processPayment(
            Order order,
            PaymentMethod paymentMethod
    ) {
        if (order == null) {
            System.out.println(
                    "Order cannot be null."
            );
            return false;
        }

        if (paymentMethod == null) {
            System.out.println(
                    "Payment method cannot be null."
            );
            return false;
        }

        if (order.isEmpty()) {
            System.out.println(
                    "Cannot process payment for an empty order."
            );
            return false;
        }

        if (order.getStatus() == OrderStatus.PAID) {
            System.out.println(
                    "Order is already paid."
            );
            return false;
        }

        System.out.println(
                "Payment initiated via "
                        + paymentMethod.getPaymentMethodName()
                        + " for Order "
                        + order.getOrderId()
        );

        boolean successful =
                paymentMethod.processPayment(order);

        if (successful) {
            order.markAsPaid();

            System.out.println(
                    "Payment for Order "
                            + order.getOrderId()
                            + " successful."
            );

            System.out.println(
                    "Order status: "
                            + order.getStatus()
            );

        } else {

            System.out.println(
                    "Payment for Order "
                            + order.getOrderId()
                            + " failed."
            );

            System.out.println(
                    "Order status: "
                            + order.getStatus()
            );
        }

        return successful;
    }
}
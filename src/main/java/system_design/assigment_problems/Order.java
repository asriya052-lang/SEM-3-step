package system_design.assigment_problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Order {

    private String orderId;
    private Customer customer;
    private List<OrderItem> items;
    private OrderStatus status;

    public Order(String orderId, Customer customer) {
        if (orderId == null || orderId.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Order ID cannot be empty."
            );
        }

        if (customer == null) {
            throw new IllegalArgumentException(
                    "Customer cannot be null."
            );
        }

        this.orderId = orderId;
        this.customer = customer;
        this.items = new ArrayList<>();
        this.status = OrderStatus.PENDING;
    }

    public String getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public List<OrderItem> getItems() {
        return Collections.unmodifiableList(items);
    }

    public void addProduct(Product product, int quantity) {
        if (status == OrderStatus.PAID) {
            throw new IllegalStateException(
                    "Cannot modify a paid order."
            );
        }

        OrderItem item = new OrderItem(product, quantity);
        items.add(item);

        System.out.println(
                quantity
                        + " x "
                        + product.getName()
                        + " added to Order "
                        + orderId
        );
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public double calculateTotal() {
        double total = 0;

        for (OrderItem item : items) {
            total += item.getItemTotal();
        }

        return total;
    }

    public void markAsPaid() {
        if (isEmpty()) {
            throw new IllegalStateException(
                    "Cannot mark an empty order as Paid."
            );
        }

        status = OrderStatus.PAID;
    }
}
package abstract_interface.class_problems;

public class Invoice implements Printable {

    private String invoiceNumber;

    public Invoice(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    @Override
    public String printLabel() {
        return "Invoice label: " + invoiceNumber;
    }

    public static void main(String[] args) {

        Invoice invoice =
                new Invoice("INV-42");

        System.out.println(invoice.printLabel());
    }
}
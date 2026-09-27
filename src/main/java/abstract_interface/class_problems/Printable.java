package abstract_interface.class_problems;

public interface Printable {

    String printLabel();
}
package abstract_interface.class_problems;

public class PackageBox implements Printable {

    private String trackingId;

    public PackageBox(String trackingId) {
        this.trackingId = trackingId;
    }

    @Override
    public String printLabel() {
        return "Package label: " + trackingId;
    }

    public static void main(String[] args) {

        PackageBox box =
                new PackageBox("TRK-88");

        System.out.println(box.printLabel());
    }
}
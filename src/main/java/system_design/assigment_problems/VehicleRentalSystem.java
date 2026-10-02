package system_design.assigment_problems;

import java.util.ArrayList;
import java.util.List;

public class VehicleRentalSystem {

    private List<Rental> rentals;

    public VehicleRentalSystem() {
        rentals = new ArrayList<>();
    }

    public Rental rentVehicle(Customer customer, Vehicle vehicle, int days) {
        if (days <= 0) {
            System.out.println("Rental duration must be greater than 0 days.");
            return null;
        }

        if (!vehicle.isAvailable()) {
            System.out.println(
                    vehicle.getModel() + " is currently unavailable."
            );
            return null;
        }

        Rental rental = new Rental(customer, vehicle, days);

        vehicle.setAvailable(false);
        rentals.add(rental);

        System.out.println(
                vehicle.getModel()
                        + " rented successfully by "
                        + customer.getName()
        );

        System.out.printf(
                "Rental charge: $%.2f%n",
                rental.getTotalCharge()
        );

        return rental;
    }

    public void returnVehicle(Rental rental) {
        if (rental == null) {
            System.out.println("Invalid rental.");
            return;
        }

        if (!rental.isActive()) {
            System.out.println("This rental has already been returned.");
            return;
        }

        rental.closeRental();
        rental.getVehicle().setAvailable(true);

        System.out.println(
                rental.getVehicle().getModel()
                        + " returned by "
                        + rental.getCustomer().getName()
        );
    }
}
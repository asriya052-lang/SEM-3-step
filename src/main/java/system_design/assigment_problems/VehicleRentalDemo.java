package system_design.assigment_problems;

public class VehicleRentalDemo {

    public static void main(String[] args) {

        VehicleRentalSystem rentalSystem = new VehicleRentalSystem();

        Customer customer1 = new Customer("C001", "Customer 1");
        Customer customer2 = new Customer("C002", "Customer 2");
        Customer customer3 = new Customer("C003", "Customer 3");

        Vehicle sedanA = new Sedan("V001", "Sedan A");
        Vehicle suvB = new SUV("V002", "SUV B");

        System.out.println("----- First Rental -----");
        Rental rental1 = rentalSystem.rentVehicle(
                customer1,
                sedanA,
                3
        );

        System.out.println();

        System.out.println("----- Second Rental Attempt -----");
        rentalSystem.rentVehicle(
                customer2,
                sedanA,
                2
        );

        System.out.println();

        System.out.println("----- Returning Sedan A -----");
        rentalSystem.returnVehicle(rental1);

        System.out.println();

        System.out.println("----- Third Rental -----");
        rentalSystem.rentVehicle(
                customer3,
                suvB,
                5
        );
    }
}
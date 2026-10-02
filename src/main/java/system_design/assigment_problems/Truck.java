package system_design.assigment_problems;

public class Truck extends Vehicle {

    private static final double DAILY_RATE = 100.0;

    public Truck(String vehicleId, String model) {
        super(vehicleId, model);
    }

    @Override
    public double calculateRentalCharge(int days) {
        return DAILY_RATE * days;
    }

    @Override
    public String getCategory() {
        return "Truck";
    }
}
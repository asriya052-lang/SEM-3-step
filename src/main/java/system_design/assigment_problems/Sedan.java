package system_design.assigment_problems;

public class Sedan extends Vehicle {

    private static final double DAILY_RATE = 50.0;

    public Sedan(String vehicleId, String model) {
        super(vehicleId, model);
    }

    @Override
    public double calculateRentalCharge(int days) {
        return DAILY_RATE * days;
    }

    @Override
    public String getCategory() {
        return "Sedan";
    }
}
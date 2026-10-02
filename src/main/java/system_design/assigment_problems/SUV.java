package system_design.assigment_problems;

public class SUV extends Vehicle {

    private static final double DAILY_RATE = 70.0;

    public SUV(String vehicleId, String model) {
        super(vehicleId, model);
    }

    @Override
    public double calculateRentalCharge(int days) {
        return DAILY_RATE * days;
    }

    @Override
    public String getCategory() {
        return "SUV";
    }
}
package system_design.assigment_problems;

public class Suite extends Room {

    private static final double DAILY_RATE = 250.0;

    public Suite(String roomNumber) {
        super(roomNumber);
    }

    @Override
    public double calculatePrice(long numberOfNights) {
        return DAILY_RATE * numberOfNights;
    }

    @Override
    public String getCategory() {
        return "Suite";
    }
}
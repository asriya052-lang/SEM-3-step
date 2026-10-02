package system_design.assigment_problems;

public class DeluxeRoom extends Room {

    private static final double DAILY_RATE = 150.0;

    public DeluxeRoom(String roomNumber) {
        super(roomNumber);
    }

    @Override
    public double calculatePrice(long numberOfNights) {
        return DAILY_RATE * numberOfNights;
    }

    @Override
    public String getCategory() {
        return "Deluxe Room";
    }
}
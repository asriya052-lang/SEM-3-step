package system_design.assigment_problems;

public class StandardRoom extends Room {

    private static final double DAILY_RATE = 100.0;

    public StandardRoom(String roomNumber) {
        super(roomNumber);
    }

    @Override
    public double calculatePrice(long numberOfNights) {
        return DAILY_RATE * numberOfNights;
    }

    @Override
    public String getCategory() {
        return "Standard Room";
    }
}
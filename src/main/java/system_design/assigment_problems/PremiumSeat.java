package system_design.assigment_problems;

public class PremiumSeat implements Seat {

    private String seatNumber;

    public PremiumSeat(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    @Override
    public String getSeatNumber() {
        return seatNumber;
    }

    @Override
    public double getPrice() {
        return 250.00;
    }
}
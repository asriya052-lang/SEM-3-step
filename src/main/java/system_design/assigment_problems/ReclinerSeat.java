package system_design.assigment_problems;

public class ReclinerSeat implements Seat {

    private String seatNumber;

    public ReclinerSeat(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    @Override
    public String getSeatNumber() {
        return seatNumber;
    }

    @Override
    public double getPrice() {
        return 400.00;
    }
}
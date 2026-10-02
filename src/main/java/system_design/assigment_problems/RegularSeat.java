package system_design.assigment_problems;

public class RegularSeat implements Seat {

    private String seatNumber;

    public RegularSeat(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    @Override
    public String getSeatNumber() {
        return seatNumber;
    }

    @Override
    public double getPrice() {
        return 150.00;
    }
}
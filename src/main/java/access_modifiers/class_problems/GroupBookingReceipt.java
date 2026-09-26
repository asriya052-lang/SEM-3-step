package access_modifiers.class_problems;

public class GroupBookingReceipt extends BookingReceipt {

    private final int groupSize;

    public GroupBookingReceipt(String bookingId,
                               String[] seatNumbers,
                               int groupSize) {
        super(bookingId, seatNumbers);
        this.groupSize = groupSize;
    }
}
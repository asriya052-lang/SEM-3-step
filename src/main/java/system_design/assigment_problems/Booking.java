package system_design.assigment_problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Booking {

    private Customer customer;
    private Show show;
    private List<Seat> seats;
    private boolean cancelled;

    public Booking(Customer customer,
                   Show show,
                   List<Seat> seats) {

        this.customer = customer;
        this.show = show;
        this.seats = new ArrayList<>(seats);
        this.cancelled = false;
    }

    public double calculateTotal() {

        double total = 0;

        for (Seat seat : seats) {
            total += seat.getPrice();
        }

        return total;
    }

    public boolean cancel() {

        if (cancelled || show.isStarted()) {
            return false;
        }

        for (Seat seat : seats) {
            show.releaseSeat(seat);
        }

        cancelled = true;
        return true;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Show getShow() {
        return show;
    }

    public List<Seat> getSeats() {
        return Collections.unmodifiableList(seats);
    }

    public boolean isCancelled() {
        return cancelled;
    }
}
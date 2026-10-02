package system_design.assigment_problems;

import java.util.HashSet;
import java.util.Set;

public class Show {

    private String showName;
    private String showTime;

    private boolean started;

    private Set<String> bookedSeats;

    public Show(String showName, String showTime) {
        this.showName = showName;
        this.showTime = showTime;
        this.started = false;
        this.bookedSeats = new HashSet<>();
    }

    public String getShowName() {
        return showName;
    }

    public String getShowTime() {
        return showTime;
    }

    public boolean isStarted() {
        return started;
    }

    public void startShow() {
        started = true;
    }

    public boolean isSeatAvailable(Seat seat) {
        return !bookedSeats.contains(seat.getSeatNumber());
    }

    public boolean reserveSeat(Seat seat) {

        if (started) {
            return false;
        }

        if (!isSeatAvailable(seat)) {
            return false;
        }

        bookedSeats.add(seat.getSeatNumber());
        return true;
    }

    public void releaseSeat(Seat seat) {
        bookedSeats.remove(seat.getSeatNumber());
    }
}
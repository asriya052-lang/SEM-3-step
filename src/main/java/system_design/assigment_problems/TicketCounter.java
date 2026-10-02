package system_design.assigment_problems;

import java.util.ArrayList;
import java.util.List;

public class TicketCounter {

    public static Booking createBooking(
            Customer customer,
            Show show,
            List<Seat> seats) {

        if (seats == null || seats.isEmpty()) {
            System.out.println(
                    "Booking rejected: No seats selected."
            );
            return null;
        }

        if (seats.size() > 6) {
            System.out.println(
                    "Booking rejected: Maximum 6 seats per booking."
            );
            return null;
        }

        for (Seat seat : seats) {

            if (!show.isSeatAvailable(seat)) {
                System.out.println(
                        "Seat "
                                + seat.getSeatNumber()
                                + " is already booked for this show."
                );
                return null;
            }
        }

        for (Seat seat : seats) {
            show.reserveSeat(seat);
        }

        Booking booking =
                new Booking(customer, show, seats);

        System.out.print(
                "Booking confirmed for "
                        + customer.getName()
                        + ": "
        );

        for (int i = 0; i < seats.size(); i++) {

            System.out.print(
                    seats.get(i).getSeatNumber()
            );

            if (i < seats.size() - 1) {
                System.out.print(", ");
            }
        }

        System.out.printf(
                ". Total: ₹%.2f%n",
                booking.calculateTotal()
        );

        return booking;
    }

    public static void main(String[] args) {

        Show show =
                new Show(
                        "Campus Premiere",
                        "7 PM"
                );

        Customer asha =
                new Customer("Asha");

        Customer ravi =
                new Customer("Ravi");

        Customer neha =
                new Customer("Neha");

        Seat a1 =
                new RegularSeat("A1");

        Seat a2 =
                new RegularSeat("A2");

        Seat f5 =
                new PremiumSeat("F5");

        Seat r1 =
                new ReclinerSeat("R1");

        // Asha books A1, A2, F5
        List<Seat> ashaSeats =
                new ArrayList<>();

        ashaSeats.add(a1);
        ashaSeats.add(a2);
        ashaSeats.add(f5);

        Booking ashaBooking =
                createBooking(
                        asha,
                        show,
                        ashaSeats
                );

        // Ravi tries to book A2
        List<Seat> raviSeatA2 =
                new ArrayList<>();

        raviSeatA2.add(
                new RegularSeat("A2")
        );

        createBooking(
                ravi,
                show,
                raviSeatA2
        );

        // Ravi books R1
        List<Seat> raviSeats =
                new ArrayList<>();

        raviSeats.add(r1);

        Booking raviBooking =
                createBooking(
                        ravi,
                        show,
                        raviSeats
                );

        // Asha cancels
        if (ashaBooking.cancel()) {

            System.out.println(
                    "Asha's booking cancelled. "
                            + "Seats A1, A2, F5 released."
            );
        }

        // Neha books A2
        List<Seat> nehaSeats =
                new ArrayList<>();

        nehaSeats.add(
                new RegularSeat("A2")
        );

        createBooking(
                neha,
                show,
                nehaSeats
        );
    }
}
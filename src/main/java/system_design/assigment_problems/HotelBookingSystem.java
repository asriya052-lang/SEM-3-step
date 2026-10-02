package system_design.assigment_problems;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class HotelBookingSystem {

    private List<Reservation> reservations;

    public HotelBookingSystem() {
        reservations = new ArrayList<>();
    }

    public boolean isRoomAvailable(
            Room room,
            LocalDate startDate,
            LocalDate endDate
    ) {
        for (Reservation reservation : reservations) {

            if (reservation.getRoom() == room
                    && reservation.getStatus()
                    == ReservationStatus.ACTIVE
                    && reservation.overlaps(startDate, endDate)) {

                return false;
            }
        }

        return true;
    }

    public Reservation createReservation(
            Customer customer,
            Room room,
            LocalDate startDate,
            LocalDate endDate,
            LocalDate cancellationDeadline
    ) {
        if (!isRoomAvailable(room, startDate, endDate)) {
            System.out.println(
                    room.getCategory()
                            + " "
                            + room.getRoomNumber()
                            + " is not available from "
                            + startDate
                            + " to "
                            + endDate
            );

            return null;
        }

        Reservation reservation =
                new Reservation(
                        customer,
                        room,
                        startDate,
                        endDate,
                        cancellationDeadline
                );

        reservations.add(reservation);

        System.out.println(
                "Reservation confirmed for "
                        + customer.getName()
                        + ", "
                        + room.getCategory()
                        + " "
                        + room.getRoomNumber()
                        + " ("
                        + startDate
                        + " to "
                        + endDate
                        + ")."
        );

        System.out.printf(
                "Price: $%.2f%n",
                reservation.calculatePrice()
        );

        return reservation;
    }

    public boolean cancelReservation(
            Reservation reservation,
            LocalDate cancellationDate
    ) {
        if (reservation == null) {
            System.out.println("Invalid reservation.");
            return false;
        }

        boolean cancelled =
                reservation.cancel(cancellationDate);

        if (cancelled) {
            System.out.println(
                    "Reservation for "
                            + reservation.getCustomer().getName()
                            + ", "
                            + reservation.getRoom().getCategory()
                            + " "
                            + reservation.getRoom().getRoomNumber()
                            + " ("
                            + reservation.getStartDate()
                            + " to "
                            + reservation.getEndDate()
                            + ") cancelled successfully."
            );
        } else {
            System.out.println(
                    "Reservation cannot be cancelled. "
                            + "The cancellation deadline has passed."
            );
        }

        return cancelled;
    }
}
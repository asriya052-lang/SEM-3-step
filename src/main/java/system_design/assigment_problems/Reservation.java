package system_design.assigment_problems;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Reservation {

    private Customer customer;
    private Room room;
    private LocalDate startDate;
    private LocalDate endDate;
    private LocalDate cancellationDeadline;
    private ReservationStatus status;

    public Reservation(
            Customer customer,
            Room room,
            LocalDate startDate,
            LocalDate endDate,
            LocalDate cancellationDeadline
    ) {
        if (customer == null || room == null) {
            throw new IllegalArgumentException(
                    "Customer and room are required."
            );
        }

        if (startDate == null || endDate == null) {
            throw new IllegalArgumentException(
                    "Start date and end date are required."
            );
        }

        if (!endDate.isAfter(startDate)) {
            throw new IllegalArgumentException(
                    "End date must be after start date."
            );
        }

        if (cancellationDeadline == null) {
            throw new IllegalArgumentException(
                    "Cancellation deadline is required."
            );
        }

        if (cancellationDeadline.isAfter(startDate)) {
            throw new IllegalArgumentException(
                    "Cancellation deadline cannot be after start date."
            );
        }

        this.customer = customer;
        this.room = room;
        this.startDate = startDate;
        this.endDate = endDate;
        this.cancellationDeadline = cancellationDeadline;
        this.status = ReservationStatus.ACTIVE;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Room getRoom() {
        return room;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public LocalDate getCancellationDeadline() {
        return cancellationDeadline;
    }

    public ReservationStatus getStatus() {
        return status;
    }

    public long getNumberOfNights() {
        return ChronoUnit.DAYS.between(startDate, endDate);
    }

    public double calculatePrice() {
        return room.calculatePrice(getNumberOfNights());
    }

    public boolean overlaps(
            LocalDate requestedStart,
            LocalDate requestedEnd
    ) {
        return requestedStart.isBefore(endDate)
                && requestedEnd.isAfter(startDate);
    }

    public boolean cancel(LocalDate cancellationDate) {

        if (status == ReservationStatus.CANCELLED) {
            return false;
        }

        if (cancellationDate.isAfter(cancellationDeadline)) {
            return false;
        }

        status = ReservationStatus.CANCELLED;
        return true;
    }
}
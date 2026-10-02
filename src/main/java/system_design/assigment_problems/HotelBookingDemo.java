package system_design.assigment_problems;

import java.time.LocalDate;

public class HotelBookingDemo {

    public static void main(String[] args) {

        HotelBookingSystem system =
                new HotelBookingSystem();

        Customer customerA =
                new Customer("C001", "Customer A");

        Customer customerB =
                new Customer("C002", "Customer B");

        Customer customerC =
                new Customer("C003", "Customer C");

        Room standard101 =
                new StandardRoom("101");

        Room deluxe201 =
                new DeluxeRoom("201");

        System.out.println("----- Availability Check -----");

        LocalDate jan1 =
                LocalDate.of(2026, 1, 1);

        LocalDate jan5 =
                LocalDate.of(2026, 1, 5);

        System.out.println(
                "Standard Room 101 available: "
                        + system.isRoomAvailable(
                        standard101,
                        jan1,
                        jan5
                )
        );

        System.out.println();

        System.out.println("----- Customer A Books Room -----");

        Reservation reservationA =
                system.createReservation(
                        customerA,
                        standard101,
                        jan1,
                        jan5,
                        LocalDate.of(2025, 12, 30)
                );

        System.out.println();

        System.out.println("----- Customer B Attempts Overlapping Booking -----");

        system.createReservation(
                customerB,
                standard101,
                LocalDate.of(2026, 1, 3),
                LocalDate.of(2026, 1, 7),
                LocalDate.of(2026, 1, 1)
        );

        System.out.println();

        System.out.println("----- Customer A Cancels -----");

        system.cancelReservation(
                reservationA,
                LocalDate.of(2025, 12, 29)
        );

        System.out.println();

        System.out.println("----- Customer C Books Deluxe Room -----");

        system.createReservation(
                customerC,
                deluxe201,
                LocalDate.of(2026, 2, 10),
                LocalDate.of(2026, 2, 12),
                LocalDate.of(2026, 2, 8)
        );
    }
}
package system_design.assigment_problems;

public class FitZoneDemo {

    public static void main(String[] args) {

        Member asha =
                new Member("Asha");

        Member ravi =
                new Member("Ravi");

        Membership ashaMembership =
                new Membership(
                        asha,
                        new QuarterlyPlan()
                );

        Membership raviMembership =
                new Membership(
                        ravi,
                        new MonthlyPlan()
                );

        System.out.printf(
                "Quarterly membership created for %s. "
                        + "Fee: ₹%.2f. Status: %s%n",
                asha.getName(),
                ashaMembership.getFee(),
                ashaMembership.getStatus()
        );

        System.out.printf(
                "Monthly membership created for %s. "
                        + "Fee: ₹%.2f. Status: %s%n",
                ravi.getName(),
                raviMembership.getFee(),
                raviMembership.getStatus()
        );

        ashaMembership.checkIn();

        ashaMembership.freeze();

        ashaMembership.checkIn();

        raviMembership.expire();

        raviMembership.freeze();
    }
}
package system_design.assigment_problems;

public class Membership {

    private Member member;
    private MembershipPlan plan;
    private MembershipStatus status;

    public Membership(Member member,
                      MembershipPlan plan) {

        this.member = member;
        this.plan = plan;
        this.status = MembershipStatus.ACTIVE;
    }

    public Member getMember() {
        return member;
    }

    public MembershipPlan getPlan() {
        return plan;
    }

    public MembershipStatus getStatus() {
        return status;
    }

    public double getFee() {
        return plan.calculateFee();
    }

    public void checkIn() {

        if (status == MembershipStatus.ACTIVE) {

            System.out.println(
                    member.getName()
                            + " checked in successfully."
            );

        } else {

            System.out.println(
                    "Check-in denied: "
                            + member.getName()
                            + "'s membership is "
                            + status
            );
        }
    }

    public void freeze() {

        if (status == MembershipStatus.ACTIVE) {

            status = MembershipStatus.FROZEN;

            System.out.println(
                    member.getName()
                            + "'s membership frozen. Status: "
                            + status
            );

        } else {

            System.out.println(
                    "Cannot freeze an "
                            + status
                            + " membership."
            );
        }
    }

    public void unfreeze() {

        if (status == MembershipStatus.FROZEN) {

            status = MembershipStatus.ACTIVE;

            System.out.println(
                    member.getName()
                            + "'s membership unfrozen. Status: "
                            + status
            );

        } else {

            System.out.println(
                    "Cannot unfreeze an "
                            + status
                            + " membership."
            );
        }
    }

    public void expire() {

        if (status != MembershipStatus.EXPIRED) {

            status = MembershipStatus.EXPIRED;

            System.out.println(
                    member.getName()
                            + "'s membership expired. Status: "
                            + status
            );
        }
    }
}
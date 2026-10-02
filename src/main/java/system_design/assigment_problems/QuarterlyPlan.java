package system_design.assigment_problems;

public class QuarterlyPlan implements MembershipPlan {

    private static final double BASE_RATE = 1000.00;

    @Override
    public double calculateFee() {
        return BASE_RATE * 3 * 0.90;
    }

    @Override
    public int getMonths() {
        return 3;
    }

    @Override
    public String getPlanName() {
        return "Quarterly";
    }
}
package system_design.assigment_problems;

public class AnnualPlan implements MembershipPlan {

    private static final double BASE_RATE = 1000.00;

    @Override
    public double calculateFee() {
        return BASE_RATE * 12 * 0.75;
    }

    @Override
    public int getMonths() {
        return 12;
    }

    @Override
    public String getPlanName() {
        return "Annual";
    }
}
package system_design.assigment_problems;

public class MonthlyPlan implements MembershipPlan {

    private static final double BASE_RATE = 1000.00;

    @Override
    public double calculateFee() {
        return BASE_RATE;
    }

    @Override
    public int getMonths() {
        return 1;
    }

    @Override
    public String getPlanName() {
        return "Monthly";
    }
}
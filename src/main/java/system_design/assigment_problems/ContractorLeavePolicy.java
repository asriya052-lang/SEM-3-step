package system_design.assigment_problems;

public class ContractorLeavePolicy implements LeavePolicy {

    private static final long MAX_LEAVE_DAYS = 7;

    @Override
    public boolean isLeaveAllowed(long numberOfDays) {
        return numberOfDays > 0 && numberOfDays <= MAX_LEAVE_DAYS;
    }

    @Override
    public String getPolicyName() {
        return "Contractors can take up to 7 days.";
    }
}
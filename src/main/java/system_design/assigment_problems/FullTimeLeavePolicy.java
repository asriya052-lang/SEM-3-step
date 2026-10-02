package system_design.assigment_problems;

public class FullTimeLeavePolicy implements LeavePolicy {

    private static final long MAX_LEAVE_DAYS = 30;

    @Override
    public boolean isLeaveAllowed(long numberOfDays) {
        return numberOfDays > 0 && numberOfDays <= MAX_LEAVE_DAYS;
    }

    @Override
    public String getPolicyName() {
        return "Full-time employees can take up to 30 days.";
    }
}
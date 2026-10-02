package system_design.assigment_problems;

public class PartTimeLeavePolicy implements LeavePolicy {

    private static final long MAX_LEAVE_DAYS = 10;

    @Override
    public boolean isLeaveAllowed(long numberOfDays) {
        return numberOfDays > 0 && numberOfDays <= MAX_LEAVE_DAYS;
    }

    @Override
    public String getPolicyName() {
        return "Part-time employees can take up to 10 days.";
    }
}
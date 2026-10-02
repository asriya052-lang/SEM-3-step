package system_design.assigment_problems;

public interface LeavePolicy {

    boolean isLeaveAllowed(long numberOfDays);

    String getPolicyName();
}
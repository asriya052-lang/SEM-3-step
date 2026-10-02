package system_design.assigment_problems;

public abstract class Employee {

    private String employeeId;
    private String name;
    private LeavePolicy leavePolicy;

    public Employee(String employeeId, String name, LeavePolicy leavePolicy) {
        this.employeeId = employeeId;
        this.name = name;
        this.leavePolicy = leavePolicy;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public LeavePolicy getLeavePolicy() {
        return leavePolicy;
    }

    public boolean isLeaveAllowed(long numberOfDays) {
        return leavePolicy.isLeaveAllowed(numberOfDays);
    }

    public abstract String getEmployeeType();
}
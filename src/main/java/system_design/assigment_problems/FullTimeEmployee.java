package system_design.assigment_problems;

public class FullTimeEmployee extends Employee {

    public FullTimeEmployee(String employeeId, String name) {
        super(
                employeeId,
                name,
                new FullTimeLeavePolicy()
        );
    }

    @Override
    public String getEmployeeType() {
        return "Full-Time Employee";
    }
}
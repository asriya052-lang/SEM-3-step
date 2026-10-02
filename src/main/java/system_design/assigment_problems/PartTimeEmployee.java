package system_design.assigment_problems;

public class PartTimeEmployee extends Employee {

    public PartTimeEmployee(String employeeId, String name) {
        super(
                employeeId,
                name,
                new PartTimeLeavePolicy()
        );
    }

    @Override
    public String getEmployeeType() {
        return "Part-Time Employee";
    }
}
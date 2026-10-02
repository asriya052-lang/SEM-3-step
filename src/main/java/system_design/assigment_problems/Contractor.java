package system_design.assigment_problems;

public class Contractor extends Employee {

    public Contractor(String employeeId, String name) {
        super(
                employeeId,
                name,
                new ContractorLeavePolicy()
        );
    }

    @Override
    public String getEmployeeType() {
        return "Contractor";
    }
}
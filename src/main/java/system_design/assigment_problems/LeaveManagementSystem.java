package system_design.assigment_problems;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LeaveManagementSystem {

    private List<LeaveRequest> leaveRequests;

    public LeaveManagementSystem() {
        leaveRequests = new ArrayList<>();
    }

    public LeaveRequest submitLeaveRequest(
            Employee employee,
            LocalDate startDate,
            LocalDate endDate
    ) {
        try {
            LeaveRequest request =
                    new LeaveRequest(employee, startDate, endDate);

            leaveRequests.add(request);

            System.out.println(
                    "Leave request submitted for "
                            + employee.getName()
                            + " ("
                            + startDate
                            + " to "
                            + endDate
                            + "). Status: "
                            + request.getStatus()
            );

            return request;

        } catch (IllegalArgumentException e) {
            System.out.println(
                    "Leave request rejected: "
                            + e.getMessage()
            );

            return null;
        }
    }

    public List<LeaveRequest> getLeaveRequests() {
        return new ArrayList<>(leaveRequests);
    }
}
package system_design.assigment_problems;

import java.time.LocalDate;

public class EmployeeLeaveDemo {

    public static void main(String[] args) {

        LeaveManagementSystem system =
                new LeaveManagementSystem();

        Employee john =
                new FullTimeEmployee("E001", "John");

        Employee jane =
                new PartTimeEmployee("E002", "Jane");

        Reviewer alice =
                new Reviewer("R001", "Alice");

        Reviewer bob =
                new Reviewer("R002", "Bob");

        System.out.println("----- John's Leave Request -----");

        LeaveRequest johnRequest =
                system.submitLeaveRequest(
                        john,
                        LocalDate.of(2026, 1, 1),
                        LocalDate.of(2026, 1, 5)
                );

        System.out.println();

        alice.approveLeave(johnRequest);

        System.out.println(
                "Status: " + johnRequest.getStatus()
        );

        System.out.println();

        System.out.println("----- Jane's Leave Request -----");

        LeaveRequest janeRequest =
                system.submitLeaveRequest(
                        jane,
                        LocalDate.of(2026, 2, 10),
                        LocalDate.of(2026, 2, 11)
                );

        System.out.println();

        bob.rejectLeave(janeRequest);

        System.out.println(
                "Status: " + janeRequest.getStatus()
        );

        System.out.println();

        System.out.println(
                "----- Invalid Status Change -----"
        );

        try {
            johnRequest.changeStatus(LeaveStatus.PENDING);
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
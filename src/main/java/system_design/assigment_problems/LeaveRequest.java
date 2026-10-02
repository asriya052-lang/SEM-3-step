package system_design.assigment_problems;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LeaveRequest {

    private Employee employee;
    private LocalDate startDate;
    private LocalDate endDate;
    private LeaveStatus status;

    public LeaveRequest(
            Employee employee,
            LocalDate startDate,
            LocalDate endDate
    ) {
        if (employee == null) {
            throw new IllegalArgumentException("Employee cannot be null.");
        }

        if (startDate == null || endDate == null) {
            throw new IllegalArgumentException("Dates cannot be null.");
        }

        if (endDate.isBefore(startDate)) {
            throw new IllegalArgumentException(
                    "End date cannot be before start date."
            );
        }

        long numberOfDays =
                ChronoUnit.DAYS.between(startDate, endDate) + 1;

        if (!employee.isLeaveAllowed(numberOfDays)) {
            throw new IllegalArgumentException(
                    "Leave request violates employee leave policy."
            );
        }

        this.employee = employee;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = LeaveStatus.PENDING;
    }

    public Employee getEmployee() {
        return employee;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public LeaveStatus getStatus() {
        return status;
    }

    public void approve() {
        if (status != LeaveStatus.PENDING) {
            throw new IllegalStateException(
                    "Only Pending requests can be approved."
            );
        }

        status = LeaveStatus.APPROVED;
    }

    public void reject() {
        if (status != LeaveStatus.PENDING) {
            throw new IllegalStateException(
                    "Only Pending requests can be rejected."
            );
        }

        status = LeaveStatus.REJECTED;
    }

    public void changeStatus(LeaveStatus newStatus) {
        if (newStatus == null) {
            throw new IllegalArgumentException(
                    "Status cannot be null."
            );
        }

        if (status != LeaveStatus.PENDING) {
            throw new IllegalStateException(
                    "Cannot change leave request status from "
                            + status
                            + " to "
                            + newStatus
                            + "."
            );
        }

        if (newStatus != LeaveStatus.APPROVED
                && newStatus != LeaveStatus.REJECTED) {
            throw new IllegalStateException(
                    "Pending request can only become Approved or Rejected."
            );
        }

        status = newStatus;
    }

    public long getNumberOfDays() {
        return ChronoUnit.DAYS.between(startDate, endDate) + 1;
    }
}
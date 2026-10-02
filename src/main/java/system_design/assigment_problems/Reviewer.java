package system_design.assigment_problems;

public class Reviewer {

    private String reviewerId;
    private String name;

    public Reviewer(String reviewerId, String name) {
        this.reviewerId = reviewerId;
        this.name = name;
    }

    public String getReviewerId() {
        return reviewerId;
    }

    public String getName() {
        return name;
    }

    public void approveLeave(LeaveRequest request) {
        if (request == null) {
            throw new IllegalArgumentException(
                    "Leave request cannot be null."
            );
        }

        request.approve();

        System.out.println(
                request.getEmployee().getName()
                        + "'s leave request ("
                        + request.getStartDate()
                        + " to "
                        + request.getEndDate()
                        + ") approved by "
                        + name
        );
    }

    public void rejectLeave(LeaveRequest request) {
        if (request == null) {
            throw new IllegalArgumentException(
                    "Leave request cannot be null."
            );
        }

        request.reject();

        System.out.println(
                request.getEmployee().getName()
                        + "'s leave request ("
                        + request.getStartDate()
                        + " to "
                        + request.getEndDate()
                        + ") rejected by "
                        + name
        );
    }
}
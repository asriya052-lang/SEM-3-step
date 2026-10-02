package system_design.assigment_problems;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Submission {

    private Student student;
    private Assignment assignment;
    private LocalDate submissionDate;

    private SubmissionStatus status;
    private double finalMarks;

    public Submission(Student student,
                      Assignment assignment,
                      LocalDate submissionDate) {

        this.student = student;
        this.assignment = assignment;
        this.submissionDate = submissionDate;
        this.status = SubmissionStatus.SUBMITTED;
        this.finalMarks = 0;
    }

    public Student getStudent() {
        return student;
    }

    public Assignment getAssignment() {
        return assignment;
    }

    public LocalDate getSubmissionDate() {
        return submissionDate;
    }

    public String getStatus() {
        return status.name();
    }

    public double getFinalMarks() {
        return finalMarks;
    }

    public long getDaysLate() {

        if (submissionDate.isAfter(
                assignment.getDueDate())) {

            return ChronoUnit.DAYS.between(
                    assignment.getDueDate(),
                    submissionDate
            );
        }

        return 0;
    }

    public boolean resubmit(LocalDate newDate) {

        if (status == SubmissionStatus.GRADED) {
            return false;
        }

        this.submissionDate = newDate;
        this.status = SubmissionStatus.SUBMITTED;

        return true;
    }

    public boolean grade(int awardedMarks) {

        if (status != SubmissionStatus.SUBMITTED) {
            return false;
        }

        if (awardedMarks < 0
                || awardedMarks > assignment.getMaxMarks()) {
            return false;
        }

        long daysLate = getDaysLate();

        finalMarks =
                assignment.applyLatePenalty(
                        awardedMarks,
                        daysLate
                );

        status = SubmissionStatus.GRADED;

        return true;
    }

    public static enum SubmissionStatus {
        SUBMITTED,
        GRADED
    }
}
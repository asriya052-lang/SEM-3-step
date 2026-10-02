package system_design.assigment_problems;

import java.time.LocalDate;

public class SubmissionPortal {

    public static void main(String[] args) {

        Student asha =
                new Student("Asha");

        Student ravi =
                new Student("Ravi");

        Assignment coding =
                new CodingAssignment(
                        "Linked List Lab",
                        LocalDate.of(2026, 3, 10),
                        50
                );

        Assignment written =
                new WrittenAssignment(
                        "Design Essay",
                        LocalDate.of(2026, 3, 12),
                        50
                );

        Submission ashaSubmission =
                new Submission(
                        asha,
                        coding,
                        LocalDate.of(2026, 3, 10)
                );

        Submission raviSubmission =
                new Submission(
                        ravi,
                        written,
                        LocalDate.of(2026, 3, 14)
                );

        System.out.println(
                "Asha's submission for '"
                        + coding.getTitle()
                        + "' received ("
                        + (ashaSubmission.getDaysLate() == 0
                        ? "on time"
                        : ashaSubmission.getDaysLate()
                        + " days late")
                        + "). Status: "
                        + ashaSubmission.getStatus()
        );

        System.out.println(
                "Ravi's submission for '"
                        + written.getTitle()
                        + "' received ("
                        + raviSubmission.getDaysLate()
                        + " days late). Status: "
                        + raviSubmission.getStatus()
        );

        ashaSubmission.grade(45);

        System.out.println(
                "Asha graded: "
                        + String.format("%.0f",
                        ashaSubmission.getFinalMarks())
                        + "/50. Status: "
                        + ashaSubmission.getStatus()
        );

        raviSubmission.grade(40);

        System.out.println(
                "Ravi graded: "
                        + String.format("%.0f",
                        raviSubmission.getFinalMarks())
                        + "/50 after "
                        + (raviSubmission.getDaysLate() * 20)
                        + "% late penalty. Status: "
                        + raviSubmission.getStatus()
        );

        boolean resubmitted =
                ashaSubmission.resubmit(
                        LocalDate.of(2026, 3, 11)
                );

        if (!resubmitted) {
            System.out.println(
                    "Cannot resubmit: '"
                            + coding.getTitle()
                            + "' has already been graded."
            );
        }
    }
}
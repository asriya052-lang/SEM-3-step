package system_design.assigment_problems;

import java.time.LocalDate;

public class WrittenAssignment extends Assignment {

    public WrittenAssignment(String title,
                             LocalDate dueDate,
                             int maxMarks) {
        super(title, dueDate, maxMarks);
    }

    @Override
    public double applyLatePenalty(
            int awardedMarks,
            long daysLate) {

        double penaltyRate = 0.20 * daysLate;
        double finalMarks =
                awardedMarks * (1 - penaltyRate);

        return Math.max(finalMarks, 0);
    }
}

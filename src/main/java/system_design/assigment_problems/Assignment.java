package system_design.assigment_problems;

import java.time.LocalDate;

public abstract class Assignment {

    private String title;
    private LocalDate dueDate;
    private int maxMarks;

    public Assignment(String title,
                      LocalDate dueDate,
                      int maxMarks) {

        this.title = title;
        this.dueDate = dueDate;
        this.maxMarks = maxMarks;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public int getMaxMarks() {
        return maxMarks;
    }

    public abstract double applyLatePenalty(
            int awardedMarks,
            long daysLate);
}
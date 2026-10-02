package system_design.assigment_problems;

import java.util.ArrayList;
import java.util.List;

public class Notice {

    private String title;
    private List<String> targetDepartments;

    public Notice(String title,
                  List<String> targetDepartments) {

        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Notice title is required."
            );
        }

        if (targetDepartments == null
                || targetDepartments.isEmpty()) {
            throw new IllegalArgumentException(
                    "At least one target department is required."
            );
        }

        this.title = title;
        this.targetDepartments =
                new ArrayList<>(targetDepartments);
    }

    public String getTitle() {
        return title;
    }

    public List<String> getTargetDepartments() {
        return new ArrayList<>(targetDepartments);
    }
}
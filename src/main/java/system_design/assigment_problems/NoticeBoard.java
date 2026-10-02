package system_design.assigment_problems;

import java.util.ArrayList;
import java.util.List;

public class NoticeBoard {

    private List<Student> students;

    public NoticeBoard() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public String postNotice(Notice notice) {

        StringBuilder result = new StringBuilder();

        result.append(
                "Notice '"
                        + notice.getTitle()
                        + "' posted to "
        );

        List<String> departments =
                notice.getTargetDepartments();

        for (int i = 0; i < departments.size(); i++) {

            result.append(departments.get(i));

            if (i < departments.size() - 1) {
                result.append(", ");
            }
        }

        result.append(".\n");

        for (Student student : students) {

            if (!departments.contains(
                    student.getDepartment())) {
                continue;
            }

            for (NotificationChannel channel :
                    student.getChannels()) {

                result.append(
                        channel.send(student, notice)
                );

                result.append(".\n");
            }
        }

        return result.toString();
    }

    public String postNoticeSafely(
            String title,
            List<String> departments) {

        try {

            Notice notice =
                    new Notice(title, departments);

            return postNotice(notice);

        } catch (IllegalArgumentException e) {

            return "Cannot post notice: "
                    + e.getMessage();
        }
    }
}
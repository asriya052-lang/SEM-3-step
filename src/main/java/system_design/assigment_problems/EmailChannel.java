package system_design.assigment_problems;

public class EmailChannel implements NotificationChannel {

    @Override
    public String send(Student student, Notice notice) {
        return "[Email → "
                + student.getName()
                + "] "
                + notice.getTitle();
    }
}
package system_design.assigment_problems;

public class AppChannel implements NotificationChannel {

    @Override
    public String send(Student student, Notice notice) {
        return "[App → "
                + student.getName()
                + "] "
                + notice.getTitle();
    }
}
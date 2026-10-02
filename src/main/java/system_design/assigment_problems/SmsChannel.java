package system_design.assigment_problems;

public class SmsChannel implements NotificationChannel {

    @Override
    public String send(Student student, Notice notice) {
        return "[SMS → "
                + student.getName()
                + "] "
                + notice.getTitle();
    }
}
package system_design.assigment_problems;

import java.util.Arrays;

public class NoticeDemo {

    public static void main(String[] args) {

        Student asha =
                new Student("Asha", "CSE");

        Student ravi =
                new Student("Ravi", "ECE");

        asha.addChannel(new EmailChannel());
        asha.addChannel(new AppChannel());

        ravi.addChannel(new SmsChannel());

        NoticeBoard board =
                new NoticeBoard();

        board.addStudent(asha);
        board.addStudent(ravi);

        System.out.print(
                board.postNoticeSafely(
                        "Lab Closed Tomorrow",
                        Arrays.asList("CSE")
                )
        );

        System.out.print(
                board.postNoticeSafely(
                        "Fee Deadline Extended",
                        Arrays.asList("CSE", "ECE")
                )
        );

        System.out.print(
                board.postNoticeSafely(
                        "Sports Day",
                        Arrays.asList()
                )
        );
    }
}
package inheritance.class_problems;

public class StudentMember extends LibraryMember {

    private String course;

    public StudentMember(String memberId,
                         int borrowLimit,
                         String course) {

        super(memberId, borrowLimit);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    @Override
    public void displayInfo() {
        System.out.println(
                "Student Member | Course: "
                        + course
                        + " | Books Borrowed: "
                        + getBooksBorrowed()
        );
    }

    public static void main(String[] args) {

        StudentMember student =
                new StudentMember(
                        "STU10",
                        3,
                        "CSE"
                );

        student.borrowBook();
        student.borrowBook();

        System.out.println(
                student.getBooksBorrowed()
        );
    }
}
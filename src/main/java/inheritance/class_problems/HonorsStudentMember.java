package inheritance.class_problems;

public class HonorsStudentMember extends StudentMember {

    private int bonusLimit;

    public HonorsStudentMember(String memberId,
                               int borrowLimit,
                               String course,
                               int bonusLimit) {

        super(memberId, borrowLimit);
        this.bonusLimit = bonusLimit;
    }

    @Override
    public void displayInfo() {
        System.out.println(
                "Honors Student Member | Course: "
                        + course
                        + " | Bonus Limit: "
                        + bonusLimit
                        + " | Books Borrowed: "
                        + getBooksBorrowed()
        );
    }
}
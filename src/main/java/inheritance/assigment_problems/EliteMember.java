package inheritance.assigment_problems;

public class EliteMember extends PremiumMember {

    private String lockerNumber;

    public EliteMember(String memberId,
                       int monthlyFee,
                       String trainerName,
                       String lockerNumber) {

        super(memberId, monthlyFee, trainerName);
        this.lockerNumber = lockerNumber;
    }

    @Override
    public void displayInfo() {
        System.out.println(
                "Elite Member | Trainer: "
                        + trainerName
                        + " | Locker: "
                        + lockerNumber
                        + " | Sessions: "
                        + getSessionsAttended()
        );
    }

    public static void main(String[] args) {

        EliteMember elite =
                new EliteMember(
                        "MEM3",
                        3000,
                        "Coach Arjun",
                        "L12"
                );

        elite.displayInfo();
    }
}
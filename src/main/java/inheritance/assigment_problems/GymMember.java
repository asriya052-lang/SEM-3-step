package inheritance.assigment_problems;

public class GymMember {

    protected String memberId;
    protected int monthlyFee;

    private int sessionsAttended;

    private int[] lateFeeHistory = new int[10];
    private int lateFeeCount;

    public GymMember(String memberId, int monthlyFee) {

        if (memberId == null
                || memberId.trim().isEmpty()
                || memberId.length() < 4) {
            throw new IllegalArgumentException("Invalid member ID");
        }

        this.memberId = memberId;
        this.monthlyFee = monthlyFee;
        this.sessionsAttended = 0;
        this.lateFeeCount = 0;
    }

    public void attendSession() {
        sessionsAttended++;
    }

    public int getSessionsAttended() {
        return sessionsAttended;
    }

    protected void chargeLateFee(int amount) {
        if (lateFeeCount < lateFeeHistory.length) {
            lateFeeHistory[lateFeeCount] = amount;
            lateFeeCount++;
        }
    }

    public int[] getLateFeeHistory() {

        int[] history = new int[lateFeeCount];

        for (int i = 0; i < lateFeeCount; i++) {
            history[i] = lateFeeHistory[i];
        }

        return history;
    }

    public int getTotalLateFees() {

        int total = 0;

        for (int i = 0; i < lateFeeCount; i++) {
            total += lateFeeHistory[i];
        }

        return total;
    }

    public String displayInfo() {
        return "Standard | Sessions: " + sessionsAttended;
    }

    public static String signUpBatch(
            String[] memberIds,
            int monthlyFee) {

        int signedUp = 0;
        int rejected = 0;

        for (String memberId : memberIds) {

            try {
                new GymMember(memberId, monthlyFee);
                signedUp++;
            } catch (IllegalArgumentException e) {
                rejected++;
            }
        }

        return "Signed Up: " + signedUp
                + " | Rejected: " + rejected;
    }

    public static String classifyGeneration(GymMember member) {

        if (member instanceof EliteMember) {
            return "Multilevel descendant (3 generations deep)";
        }

        if (member instanceof GroupClassMember) {
            return "Hierarchical sibling (independent branch)";
        }

        if (member instanceof PremiumMember) {
            return "Second generation (Premium Member)";
        }

        return "Base member";
    }

    public static int getTotalSessionsAttended(GymMember[] members) {

        int total = 0;

        for (GymMember member : members) {
            total += member.getSessionsAttended();
        }

        return total;
    }

    public static String batchPrint(GymMember[] members) {

        StringBuilder announcement = new StringBuilder();

        for (GymMember member : members) {

            announcement.append(member.displayInfo());

            if (member instanceof PremiumMember) {

                PremiumMember premium =
                        (PremiumMember) member;

                announcement.append(
                        " [Trainer via downcast: "
                                + premium.getTrainerName()
                                + "]"
                );
            }

            announcement.append(" | ");
        }

        return announcement.toString();
    }

    public static void main(String[] args) {

        GymMember plain =
                new GymMember("MEM6", 1000);

        PremiumMember premium =
                new PremiumMember(
                        "MEM7",
                        2000,
                        "Coach Riya"
                );

        System.out.println(
                batchPrint(
                        new GymMember[]{
                                plain,
                                premium
                        }
                )
        );
    }
}
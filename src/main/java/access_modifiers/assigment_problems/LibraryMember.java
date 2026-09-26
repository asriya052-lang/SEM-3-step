package access_modifiers.assigment_problems;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class LibraryMember {

    // Problem 1: access modifiers
    private String membershipPin;
    String branchCode;
    protected double finesOwed;
    public String displayName;

    // Problem 4: JavaBean properties
    private String membershipId;
    private String name;
    private boolean premiumMember;
    private String securityAnswer;

    // Problem 4: public no-argument constructor
    public LibraryMember() {
    }

    // Problem 1 constructor
    public LibraryMember(String membershipPin,
                         String branchCode,
                         double finesOwed,
                         String displayName) {
        this.membershipPin = membershipPin;
        this.branchCode = branchCode;
        this.finesOwed = finesOwed;
        this.displayName = displayName;
    }

    // Problem 4: write-once membershipId
    public String getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(String id) {
        if (membershipId == null) {
            membershipId = id;
        }
    }

    // JavaBean name property
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // JavaBean boolean property
    public boolean isPremiumMember() {
        return premiumMember;
    }

    public void setPremiumMember(boolean premium) {
        this.premiumMember = premium;
    }

    // Write-only securityAnswer
    public void setSecurityAnswer(String answer) {
        securityAnswer = hashAnswer(answer);
    }

    private String hashAnswer(String answer) {

        try {
            MessageDigest digest =
                    MessageDigest.getInstance("SHA-256");

            byte[] hashedBytes =
                    digest.digest(
                            answer.getBytes(StandardCharsets.UTF_8)
                    );

            StringBuilder result = new StringBuilder();

            for (byte b : hashedBytes) {
                result.append(String.format("%02x", b));
            }

            return result.toString();

        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(
                    "SHA-256 is not available", e
            );
        }
    }

    public static void main(String[] args) {

        LibraryMember member = new LibraryMember();

        member.setMembershipId("LIB-8841");
        member.setName("Priya Nair");
        member.setPremiumMember(true);

        System.out.println(member.getMembershipId());

        member.setMembershipId("FAKE-0000");

        System.out.println(member.getMembershipId());

        System.out.println(member.isPremiumMember());

        member.setSecurityAnswer("BlueMountain");

        System.out.println("Security answer stored successfully");
    }
}
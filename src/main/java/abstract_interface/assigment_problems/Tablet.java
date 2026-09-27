package abstract_interface.assigment_problems;

public class Tablet extends ClassroomDevice implements Chargeable {

    private String assetTag;

    public Tablet(String assetTag) {
        this.assetTag = assetTag;
    }

    @Override
    public String operate() {
        return "Tablet " + assetTag + " displaying lesson";
    }

    @Override
    public String charge() {
        return assetTag + " charging";
    }

    @Override
    public String charge(int minutes) {
        return assetTag + " charging for " + minutes + " minutes";
    }

    public static void main(String[] args) {

        Tablet tablet = new Tablet("TAB-5");

        System.out.println(tablet.operate());
        System.out.println(tablet.charge());
        System.out.println(tablet.charge(30));
    }
}
package system_design.assigment_problems;

public class QuickWash implements WashType {

    @Override
    public String getName() {
        return "Quick";
    }

    @Override
    public int getDuration() {
        return 30;
    }

    @Override
    public double getCharge() {
        return 20.00;
    }
}
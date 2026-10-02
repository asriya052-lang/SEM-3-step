package system_design.assigment_problems;

public class NormalWash implements WashType {

    @Override
    public String getName() {
        return "Normal";
    }

    @Override
    public int getDuration() {
        return 45;
    }

    @Override
    public double getCharge() {
        return 30.00;
    }
}
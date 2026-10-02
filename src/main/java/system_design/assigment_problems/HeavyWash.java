package system_design.assigment_problems;

public class HeavyWash implements WashType {

    @Override
    public String getName() {
        return "Heavy";
    }

    @Override
    public int getDuration() {
        return 60;
    }

    @Override
    public double getCharge() {
        return 45.00;
    }
}
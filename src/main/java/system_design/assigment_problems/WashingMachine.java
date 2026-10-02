package system_design.assigment_problems;

public class WashingMachine {

    private String machineId;
    private boolean busy;
    private WashCycle currentCycle;

    public WashingMachine(String machineId) {
        this.machineId = machineId;
        this.busy = false;
    }

    public String getMachineId() {
        return machineId;
    }

    public boolean isBusy() {
        return busy;
    }

    public WashCycle startWash(Student student, WashType washType) {

        if (busy) {
            return null;
        }

        currentCycle =
                new WashCycle(student, this, washType);

        busy = true;

        return currentCycle;
    }

    public boolean completeCycle() {

        if (!busy) {
            return false;
        }

        busy = false;
        currentCycle = null;

        return true;
    }
}
package system_design.assigment_problems;

public class LaundrySystem {

    public static void main(String[] args) {

        Student asha = new Student("Asha");
        Student ravi = new Student("Ravi");
        Student neha = new Student("Neha");

        WashingMachine machine1 =
                new WashingMachine("M1");

        WashingMachine machine2 =
                new WashingMachine("M2");

        WashType quick =
                new QuickWash();

        WashType normal =
                new NormalWash();

        WashType heavy =
                new HeavyWash();

        // Asha starts Quick wash on M1
        WashCycle cycle1 =
                machine1.startWash(asha, quick);

        System.out.println(cycle1.getSummary());

        // Ravi tries Heavy wash on busy M1
        WashCycle cycle2 =
                machine1.startWash(ravi, heavy);

        if (cycle2 == null) {
            System.out.println(
                    "Machine M1 is currently busy."
            );
        }

        // Ravi starts Heavy wash on M2
        WashCycle cycle3 =
                machine2.startWash(ravi, heavy);

        System.out.println(cycle3.getSummary());

        // M1 completes
        if (machine1.completeCycle()) {
            System.out.println(
                    "M1 cycle completed. M1 is now free."
            );
        }

        // Neha starts Normal wash on M1
        WashCycle cycle4 =
                machine1.startWash(neha, normal);

        System.out.println(cycle4.getSummary());
    }
}
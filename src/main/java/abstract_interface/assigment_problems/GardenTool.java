package abstract_interface.assigment_problems;

public abstract class GardenTool {

    public GardenTool() {
    }

    public abstract String use();

    public static void main(String[] args) {

        CuttingTool cuttingTool = new CuttingTool();
        Pruner pruner = new Pruner();

        System.out.println(cuttingTool.use());
        System.out.println(pruner.use());
    }
}
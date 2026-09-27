package abstract_interface.assigment_problems;

public class CuttingTool extends GardenTool {

    public CuttingTool() {
        super();
    }

    @Override
    public String use() {
        return superUseMessage();
    }

    protected String superUseMessage() {
        return "Using the tool in the garden, blade sharpened first";
    }
}
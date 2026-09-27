package abstract_interface.class_problems;

public class Blender extends KitchenTool implements Washable {

    public Blender() {
        super();
    }

    @Override
    public String prepare() {
        return "Blending at speed " + getSpeedLevel();
    }

    @Override
    public String clean() {
        return "Blender rinsed and dried";
    }

    public static void main(String[] args) {

        Blender blender = new Blender();

        blender.setSpeedLevel(3);

        System.out.println(
                blender.getSpeedLevel()
        );

        blender.setSpeedLevel(9);

        System.out.println(
                blender.getSpeedLevel()
        );

        System.out.println(
                blender.prepare()
        );

        System.out.println(
                blender.clean()
        );
    }
}
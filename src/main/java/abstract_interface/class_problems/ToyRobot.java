package abstract_interface.class_problems;

public class ToyRobot extends Toy {

    public ToyRobot(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return name + ": Beep boop!";
    }

    public static void main(String[] args) {

        ToyRobot robot = new ToyRobot("Bolt");

        System.out.println(robot.makeSound());
        System.out.println(robot.getToyId());
    }
}
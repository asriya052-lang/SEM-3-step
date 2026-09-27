package abstract_interface.class_problems;

public class ToyCar extends Toy {

    public ToyCar(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return name + ": Vroom vroom!";
    }

    public static void main(String[] args) {

        ToyCar car = new ToyCar("Speedster");

        System.out.println(car.makeSound());
        System.out.println(car.getToyId());
    }
}
package abstract_interface.assigment_problems;

public interface Ringable {

    String ring();

    static void ringAll(Ringable[] devices) {
        for (Ringable device : devices) {
            System.out.println(device.ring());
        }
    }

    public static void main(String[] args) {

        AlarmClock alarm = new AlarmClock("7:00 AM");
        Doorbell doorbell = new Doorbell("Front Door");

        System.out.println(alarm.ring());
        System.out.println(doorbell.ring());

        ringAll(new Ringable[]{
                alarm,
                doorbell
        });
    }
}
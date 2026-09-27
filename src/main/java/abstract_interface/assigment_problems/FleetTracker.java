package abstract_interface.assigment_problems;

public class FleetTracker {

    public static String getLocationIfTrackable(Object object) {

        if (object instanceof Trackable) {

            Trackable trackable = (Trackable) object;

            return trackable.getLocation();
        }

        return "Tracking not available";
    }

    public static void main(String[] args) {

        DeliveryDrone deliveryDrone =
                new DeliveryDrone("DR-1");

        ScoutDrone scoutDrone =
                new ScoutDrone("SC-1");

        GroundRobot groundRobot =
                new GroundRobot("GR-1");

        System.out.println(
                getLocationIfTrackable(deliveryDrone)
        );

        System.out.println(
                getLocationIfTrackable(scoutDrone)
        );

        System.out.println(
                getLocationIfTrackable(groundRobot)
        );
    }
}
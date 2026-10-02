package system_design.assigment_problems;

public abstract class Room {

    private String roomNumber;

    public Room(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public abstract double calculatePrice(long numberOfNights);

    public abstract String getCategory();
}
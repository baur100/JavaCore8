package homework15;

public class RoomNames {
    private String RoomNames;

    public RoomNames(String roomNames) {
        RoomNames = roomNames;
    }

    public String getRoomNames() {
        return RoomNames;
    }

    public void setRoomNames(String roomNames) {
        RoomNames = roomNames;
    }

    @Override
    public String toString() {
        return "RoomNames{" +
                "RoomNames='" + RoomNames + '\'' +
                '}';
    }
}

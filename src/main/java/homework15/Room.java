package homework15;

public class Room {
    private Integer room;

    public Room(Integer room) {
        this.room = room;
    }

    public Integer getRoom() {
        return room;
    }

    public void setRoom(Integer room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "Room{" +
                "room=" + room +
                '}';
    }
}

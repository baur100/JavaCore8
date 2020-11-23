package homework15;

import java.util.List;
import java.util.Map;

public class Doctor {
    private String name;
    private String lastName;
    private Position position;
    private Map<Integer,String> rooms;
    private List<InsuranseCompanies> acceptedInsuranses;

    public Doctor(String name, String lastName, Position position, Map<Integer, String> rooms, List<InsuranseCompanies> acceptedInsuranses) {
        this.name = name;
        this.lastName = lastName;
        this.position = position;
        this.rooms = rooms;
        this.acceptedInsuranses = acceptedInsuranses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Map<Integer, String> getRooms() {
        return rooms;
    }

    public void setRooms(Map<Integer, String> rooms) {
        this.rooms = rooms;
    }

    public List<InsuranseCompanies> getAcceptedInsuranses() {
        return acceptedInsuranses;
    }

    public void setAcceptedInsuranses(List<InsuranseCompanies> acceptedInsuranses) {
        this.acceptedInsuranses = acceptedInsuranses;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position=" + position +
                ", rooms=" + rooms +
                ", acceptedInsuranses=" + acceptedInsuranses +
                '}';
    }


    public void printDoctors(){
        System.out.println(name + " " + lastName + " " + position + " ");
    }
}

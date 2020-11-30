package hw16;

import hw15.Address;

import java.util.Map;

public class Farm {
    private String name;
    private Address address;
    private Map <Cattle, Integer> cattle;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Map<Cattle, Integer> getCattle() {
        return cattle;
    }

    public void setCattle(Map<Cattle, Integer> cattle) {
        this.cattle = cattle;
    }

    public Farm(String name, Address address, Map<Cattle, Integer> cattle) {
        this.name = name;
        this.address = address;
        this.cattle = cattle;


    }
}

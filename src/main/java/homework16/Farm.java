package homework16;

import homework16.Address;
import homework16.AgreeCultural;
import homework16.Cattle;

import java.util.List;
import java.util.Map;

public class Farm {
    private String name;
    private Address address;
    private Map<Cattle,Integer> cattle;
    private List<AgreeCultural> agreeCultural;

    public Farm(String name, Address address, Map<Cattle, Integer> cattle, List<AgreeCultural> agreeCultural) {
        this.name = name;
        this.address = address;
        this.cattle = cattle;
        this.agreeCultural = agreeCultural;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public Map<Cattle, Integer> getCattle() {
        return cattle;
    }

    public List<AgreeCultural> getAgreeCultural() {
        return agreeCultural;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setCattle(Map<Cattle, Integer> cattle) {
        this.cattle = cattle;
    }

    public void setAgreeCultural(List<AgreeCultural> agreeCultural) {
        this.agreeCultural = agreeCultural;
    }

    @Override
    public String toString() {
        return "Farm:" +
                "name=" + name +
                ", address=" + address +
                ", cattle=" + cattle +
                ", agreeCultural=" + agreeCultural;
    }
    public void printAgreeCaltural(List<AgreeCultural> agreeCultural){
        for(AgreeCultural a: agreeCultural){
            System.out.println(agreeCultural+"\non the filed number"+ a.getFielsNumber());
        }
    }
    public void printCattleAmmount(Map<Cattle,Integer>cattle){
        cattle.entrySet().forEach(entry->{
            System.out.println(entry.getKey()+" "+entry.getValue());
        });
    }
    public void printInfo(){
        System.out.println(name+" on "+address);
        printAgreeCaltural(agreeCultural);
        printCattleAmmount(cattle);
    }
}

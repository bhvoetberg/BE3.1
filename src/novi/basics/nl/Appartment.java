package novi.basics.nl;

import java.util.List;
import java.util.ArrayList;

public class Appartment {
    private String streetName;
    private String houseNumber;
    private List<Person> persons;

    //Constructor (1)
    public Appartment(String streetName, String houseNumber, List<Person> persons) {
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.persons = persons;
    }

    //Constructor (2)
    public Appartment(String streetName, String houseNumber) {
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        persons = new ArrayList<>();
    }

    // Je kunt zelf alle getters en setters toevoegen. Omdat dit voor het eerst is dat jullie met een datatype List<>
    // als instance variable werken, staat de getter en setter van person hieronder wel genoemd.


    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    public void addPerson(Person person) {
        persons.add(person);
    }

    public void showInformation() {
        System.out.println("Er wonen " + persons.size() + " in het appartement op: " + streetName);
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Op ").append(streetName).append(" ").append(houseNumber).append(" wonen ")
                .append(persons.size()).append(" mensen:");

        for(Person inhabitant : persons) {
            stringBuilder.append("\n\r").append(inhabitant.toString()).append(".");
        }
        stringBuilder.append("\n\r");
        return stringBuilder.toString();
    }


}
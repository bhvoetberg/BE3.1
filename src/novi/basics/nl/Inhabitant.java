package novi.basics.nl;

public class Inhabitant {
    private String firstName;
    private String lastName;
    private House house;

    //Constructor (1)
    public Inhabitant(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Constructor (2)
    public Inhabitant(String firstName, String lastName, House house) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.house = house;
    }

    // House getter
    public House getHouse() {
        return house;
    }

    // House setter
    public void setHouse(House house) {
        this.house = house;
    }

    // Andere getters en Setters zijn weggelaten. Die kunnen jullie zelf toevoegen.

    @Override
    public String toString() {
        String string = firstName + " " + lastName;
        if(house != null) {
            string += " woont op " + house.toString() + ".";
        } else {
            string += " is dakloos.";
        }
        return string;
    }
}

package novi.basics.nl;

import java.util.ArrayList;
import java.util.List;

public class House {
    private String streetName;
    private String houseNumber;

    //Constructor (1)
    public House(String streetName, String houseNumber) {
        this.streetName = streetName;
        this.houseNumber = houseNumber;
    }

    // Getters en Setters weggelaten

    @Override
    public String toString() {
        return streetName + " " + houseNumber;
    }
}
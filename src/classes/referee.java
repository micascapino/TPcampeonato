package classes;

import java.util.Date;

public class Referee extends Person {
    public Referee(String name, Date birthDate, String typeDNI, String dNI, String nationality, int years) {
        super(name, birthDate, typeDNI, dNI, nationality);
        this.years = years;
    }

    private int years;


}

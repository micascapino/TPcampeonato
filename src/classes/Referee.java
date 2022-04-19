package classes;

import java.util.Date;

public class Referee extends Person {
    public Referee(String name, Date birthDate, String typeDNI, String dNI, String nationality, int years) {
        super(name, birthDate, typeDNI, dNI, nationality);
        this.years = years;
    }

    private int years;

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    @Override
    public String toString() {
        return super.toString() + " Referee: [Years on service:" + years +"] ";
    }


}

package classes;

import java.util.Date;

public class DT extends TeamMember{
    public DT(String name, Date birthDate, String typeDNI, String dNI, String nationality, int titles) {
        super(name, birthDate, typeDNI, dNI, nationality);
        this.titles=titles;
    }

    private int titles;

    public int getTitles() {
        return titles;
    }

    public void setTitles(int titles) {
        this.titles = titles;
    }

}

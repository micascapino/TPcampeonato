package classes;

import java.util.Date;

public abstract class TeamMember extends Person {
    public TeamMember(String name, Date localDate, String typeDNI, String dNI, String nationality) {
        super(name, localDate, typeDNI, dNI, nationality);
    }
    
}

package classes;
import java.util.Date;

public abstract class person {
    private String name;
    private Date birthDate;
    private String typeDNI;
    private String DNI;
    private String nationality;

    public String getName() {
        return name;
    };

    public String getNationality() {
        return nationality;
    };
}

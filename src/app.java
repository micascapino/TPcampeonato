
import java.time.LocalDate;
import classes.Player;
import classes.Team;
import enums.*;

class app {
    public static void main(String args[]) {
        System.out.println("Holis :)");
        Team boquitaPapa = new Team("Boquita", "Argentina", 1);
        Player riquelme = new Player("Juan Roman Riquelme", LocalDate.now(), "DNI", "129230242", "Argentina",
                Positions.FORWARD, 90);
        boquitaPapa.addMember(riquelme);
    };

}

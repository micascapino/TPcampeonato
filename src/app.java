
import java.time.Instant;
import java.util.Date;

import classes.Match;
import classes.Player;
import classes.Referee;
import classes.Team;
import enums.*;

class app {
    public static void main(String args[]) {
        System.out.println("Campeonato Anual de Futbol :)");

        Team boquita = new Team("Boquita", "Argentina", 1);
        Team river = new Team("River","Argentina",2);

        Player riquelme = new Player("Juan Roman Riquelme", Date.from(Instant.now()), "DNI", "129230242", "Argentina",
                Positions.FORWARD, 90);
        boquita.addMember(riquelme);

        Player palermo = new Player("Martin Palermo", Date.from(Instant.now()), "DNI", "34012934", "Argentina",
        Positions.FORWARD, 91);
        boquita.addMember(palermo);

        Player alvarez = new Player("Julian Alvarez", Date.from(Instant.now()), "DNI", "40012934", "Argentina",
        Positions.FORWARD, 91);
        river.addMember(alvarez);

        Referee pitana = new Referee("Nestor Pitana", Date.from(Instant.now()), "DNI", "99012934", "Argentina", 15);

        Match first = new Match(Date.from(Instant.now()), boquita,river,pitana);
        first.result();
        first.toString();
        //System.out.println(boquita.toString());
    };

}

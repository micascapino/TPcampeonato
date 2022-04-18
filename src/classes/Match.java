package classes;

import java.util.Date;
import java.util.Random;

public class Match {
    private Date date;
    private Team local;
    private Team visitor;
    private Referee ref;

    public void result(Team local, Team visitor) {
        Random randomGenerator = new Random();
        int localGoal = randomGenerator.nextInt(10);
        int visitorGoal = randomGenerator.nextInt(10);

        System.out.println(
                "Resultado " + local.getName() + ": " + localGoal + " - " + visitorGoal + " : " + visitor.getName());
        if (localGoal > visitorGoal) {
            // actualizar tabla
            System.out.println("Ganador: " + local.getName());

        } else if (localGoal < visitorGoal) {
            // actualizar tabla
            System.out.println("Ganador: " + visitor.getName());
        } else {
            // actualizar: un punto a cada uno
            System.out.println("Empate");
        }
    }
}

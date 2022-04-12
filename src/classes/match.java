package classes;

import java.util.Date;
import java.util.Random;

public class match {
    private Date date;
    private team local;
    private team visitor;
    private referee ref;

    public void result(team local, team visitor) {
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

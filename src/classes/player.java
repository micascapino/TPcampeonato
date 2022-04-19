package classes;

import java.time.LocalDate;
import java.util.Date;


import enums.*;

public class Player extends TeamMember {

    public Player(String name, LocalDate localDate, String typeDNI, String dNI, String nationality, Positions position,
            int handicap) {
        super(name, localDate, typeDNI, dNI, nationality);
        this.position = position;
        this.handicap = handicap;
    }

    private Positions position;
    private int handicap;

};

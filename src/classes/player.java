package classes;

enum Position {
    GOALKEEPER, DEFENDER, MIDFIELDER, FORWARD
};

public class Player extends TeamMember {
    private Position position;
    private int handicap;
};

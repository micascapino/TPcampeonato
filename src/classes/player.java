package classes;

enum Position {
    GOALKEEPER, DEFENDER, MIDFIELDER, FORWARD
};

public class player extends teamMember {
    private Position position;
    private int handicap;
};

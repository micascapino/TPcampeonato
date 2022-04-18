package classes;

import java.util.Set;

public class Team {
    private String name;
    private String country;
    private int rankingPosition;
    private Set<TeamMember> teamList;

    public Team(String n, String c, int r) {
        name = n;
        country = c;
        rankingPosition = r;
        teamList = null;
    }

    public String getName() {
        return name;
    };
}

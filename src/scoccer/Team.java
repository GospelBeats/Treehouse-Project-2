package scoccer;

import java.util.TreeSet;
//import java.util.ArrayList;

public class Team implements Comparable<Team> {

    public static int MAX_PLAYERS = 11;
    private final String name;
    private String coach;
    TreeSet<Player> players = new TreeSet<>();

    public Team(String team, String coach) {
        this.name = team;
        this.coach = coach;
    }

    @Override
    public String toString() {
        return name;
    }
    
    @Override
    public int compareTo(Team o) {
        return this.name.compareToIgnoreCase(o.name);
    }

    public void addPlayer(Player player) {
        if (!players.contains(player)) {
            players.add(player);
        }
    }

    public void removePlayer(Player player) {
        players.remove(player);
    }

    public TreeSet<Player> getPlayers() {
        return new TreeSet<>(players);
    }
}


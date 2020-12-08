package de.exxcellent.challenge.model;

import com.opencsv.bean.CsvBindByName;

public class Football {
    @CsvBindByName(column = "Team")
    private String team;
    @CsvBindByName(column = "Games")
    private int games;
    @CsvBindByName(column = "Wins")
    private int wins;
    @CsvBindByName(column = "Losses")
    private int losses;
    @CsvBindByName(column = "Draws")
    private int draws;
    @CsvBindByName(column = "Goals")
    private int goals;
    @CsvBindByName(column = "Goals Allowed")
    private int goalsAllowed;
    @CsvBindByName(column = "Points")
    private int points;

    public int goalsSpread() {
        return Math.abs(goals - goalsAllowed);
    }

    @Override
    public String toString() {
        return "Football{" +
                "team='" + team + '\'' +
                ", games=" + games +
                ", wins=" + wins +
                ", losses=" + losses +
                ", draws=" + draws +
                ", goals=" + goals +
                ", goalsAllowed=" + goalsAllowed +
                ", points=" + points +
                '}';
    }
}

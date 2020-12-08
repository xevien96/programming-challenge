package de.exxcellent.challenge.model;

import com.opencsv.bean.CsvBindByName;

/**
 * This class that represents the football object from the .csv file.
 *
 * @author Johann Helbig
 */
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

    /**
     * This method calculates the difference between goals and goals allowed.
     *
     * @return absolute difference between goals and goals allowed
     */
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

package de.exxcellent.challenge.model;

import com.opencsv.bean.CsvBindByName;

public class Weather {

    @CsvBindByName(column = "Day")
    private int dayOfMonth;
    @CsvBindByName(column = "MxT")
    private int maxTemperature;
    @CsvBindByName(column = "MnT")
    private int minTemperature;
    @CsvBindByName(column = "AvT")
    private double averageTemperature;
    @CsvBindByName(column = "AvDP")
    private double averageDP;
    @CsvBindByName(column = "1HrP TPcpn")
    private int oneHrP;
    @CsvBindByName(column = "PDir")
    private int pDir;
    @CsvBindByName(column = "AvSp")
    private double avSp;
    @CsvBindByName(column = "Dir")
    private int dir;
    @CsvBindByName(column = "MxS")
    private int maxS;
    @CsvBindByName(column = "SkyC")
    private double skyC;
    @CsvBindByName(column = "MxR")
    private int maxR;
    @CsvBindByName(column = "Mn")
    private int mn;

    @Override
    public String toString() {
        return "Weather{" +
                "dayOfMonth=" + dayOfMonth +
                ", maxTemperature=" + maxTemperature +
                ", minTemperature=" + minTemperature +
                ", averageTemperature=" + averageTemperature +
                ", averageDP=" + averageDP +
                ", oneHrP=" + oneHrP +
                ", pDir=" + pDir +
                ", avSp=" + avSp +
                ", dir=" + dir +
                ", maxS=" + maxS +
                ", skyC=" + skyC +
                ", maxR=" + maxR +
                ", mn=" + mn +
                '}';
    }
}

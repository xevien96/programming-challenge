package de.exxcellent.challenge;

import de.exxcellent.challenge.model.Weather;
import de.exxcellent.challenge.reader.WeatherReader;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * The entry class for your solution. This class is only aimed as starting point and not intended as baseline for your software
 * design. Read: create your own classes and packages as appropriate.
 *
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
public final class App {

    /**
     * This is the main entry method of your program.
     *
     * @param args The CLI arguments passed
     */
    public static void main(String... args) {

        WeatherReader weatherReader = new WeatherReader();
        List<Weather> weatherList = weatherReader.readFromCsv("src/main/resources/de/exxcellent/challenge/weather.csv");

        Weather weatherWithSmallestTempSpread = weatherList.stream().min(Comparator.comparing
                (Weather::temperatureSpread)).orElseThrow(NoSuchElementException::new);

        String dayWithSmallestTempSpread = weatherWithSmallestTempSpread.toString();     // Your day analysis function call …
        System.out.printf("Day with smallest temperature spread : %s%n", dayWithSmallestTempSpread);

        String teamWithSmallestGoalSpread = "A good team"; // Your goal analysis function call …
        System.out.printf("Team with smallest goal spread       : %s%n", teamWithSmallestGoalSpread);
    }
}

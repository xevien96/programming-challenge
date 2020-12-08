package de.exxcellent.challenge.reader;

import com.opencsv.bean.CsvToBeanBuilder;
import de.exxcellent.challenge.model.Weather;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

/**
 * Reader class for weather objects.
 *
 * @author Johann Helbig
 */
public class WeatherReader implements Reader {

    /**
     * Method for reading weather objects from a .csv file.
     *
     * @param pathToFile Path to the .csv file
     * @return List of weather objects read from the .csv file
     */
    @Override
    public List<Weather> readFromCsv(String pathToFile) {
        File weatherFile = new File(pathToFile);
        try {
            List<Weather> weatherList = new CsvToBeanBuilder<Weather>(new FileReader(weatherFile))
                    .withType(Weather.class).build().parse();
            return weatherList;
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
        return null;
    }
}

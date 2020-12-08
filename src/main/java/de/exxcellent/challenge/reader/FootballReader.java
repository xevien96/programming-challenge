package de.exxcellent.challenge.reader;

import com.opencsv.bean.CsvToBeanBuilder;
import de.exxcellent.challenge.model.Football;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class FootballReader implements Reader {

    @Override
    public List<Football> readFromCsv(String pathToFile) {
        File footballFile = new File(pathToFile);
        try {
            List<Football> footballList = new CsvToBeanBuilder<Football>(new FileReader(footballFile))
                    .withType(Football.class).build().parse();
            return footballList;
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
        return null;
    }
}

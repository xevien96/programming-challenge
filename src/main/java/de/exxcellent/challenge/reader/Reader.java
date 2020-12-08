package de.exxcellent.challenge.reader;

import java.util.List;

public interface Reader {

    <T> List<T> readFromCsv(String pathToFile);
}

package de.exxcellent.challenge.reader;

import java.util.List;

/**
 * Interface for Reader classes
 *
 * @author Johann Helbig
 */
public interface Reader {

    <T> List<T> readFromCsv(String pathToFile);
}

package basicSetup;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class CsvReader {
    String filepath = "user.dir"+ "" ;
    public static Object[][] readCSVFile(String filePath) throws IOException {
        // Create CSVReader to read the CSV file
        try (CSVReader csvReader = new CSVReader(new FileReader(filePath))) {
            // Read all lines at once into a list
            List<String[]> allRows = null;
            try {
                allRows = csvReader.readAll();
            } catch (CsvException e) {
                throw new RuntimeException(e);
            }

            // Convert List<String[]> to Object[][]
            int rows = allRows.size();
            int columns = allRows.get(0).length;

            Object[][] data = new Object[rows][columns];
            for (int i = 0; i < rows; i++) {
                String[] row = allRows.get(i);
                for (int j = 0; j < columns; j++) {
                    data[i][j] = row[j];
                }
            }
            return data;
        }
    }
}


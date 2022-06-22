package htw.berlin.covidtracker.services;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoronaVirusDataServicesTests {

    private int hallo=0;

    @Test
    @DisplayName("check if the proper amount of locationStats has been added")
    public void testStats() throws IOException, InterruptedException {
        CoronaVirusDataService dataService= new CoronaVirusDataService();

        dataService.fetchVirusData();
        String first = dataService.getAllStats().get(0).getCountry();
        String expected="Afghanistan";
        assertEquals(first, expected);

    }
}

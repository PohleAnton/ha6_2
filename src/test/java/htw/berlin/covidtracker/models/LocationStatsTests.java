package htw.berlin.covidtracker.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class LocationStatsTests {


    final String state = "Berlin";
    final String country = "Germany";
    final int latestTotalCases = 0;

    final LocationStats locationStats = new LocationStats();

    @Test
    @DisplayName("checks toString")
    public void checkText() {
        locationStats.setCountry(country);
        locationStats.setState(state);
        locationStats.setLatestTotalCases(latestTotalCases);
        String toCheck = locationStats.toString();
        String expected = "LocationStats{" + "state='Berlin" + '\'' + ", country='Germany" + '\'' + ", latestTotalCases=0}";
        assertEquals(toCheck, expected);
    }

}

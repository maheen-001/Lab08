package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {

    // Test for hasCity()
    @Test
    public void testHasCity() {
        CustomList customList = new CustomList();
        City city = new City("Edmonton", "Alberta");
        customList.addCity(city);

        // should be true for a city that was added
        assertTrue(customList.hasCity(city));

        // should be false for a city that wasn't added
        City fakeCity = new City("Calgary", "Alberta");
        assertFalse(customList.hasCity(fakeCity));
    }

    // Test for deleteCity()
    @Test
    public void testDeleteCity() {
        CustomList customList = new CustomList();

        // add cities
        City first = new City("Edmonton", "Alberta");
        City second = new City("Calgary", "Alberta");
        customList.addCity(first);
        customList.addCity(second);

        // delete a city
        customList.deleteCity(first);

        // Shouldn't have Edmonton, but should still have Calgary
        assertFalse(customList.hasCity(first));
        assertTrue(customList.hasCity(second));
    }

    // Test for countCities()
    @Test
    public void testCountCities() {
        CustomList customList = new CustomList();

        // no cities added, so the list should be empty (0 elements)
        assertEquals(0, customList.countCities());

        // add two cities and count
        City first = new City("Edmonton", "Alberta");
        City second = new City("Calgary", "Alberta");
        customList.addCity(first);
        customList.addCity(second);
        assertEquals(2, customList.countCities());

        // delete a city, and count again
        customList.deleteCity(second);
        assertEquals(1, customList.countCities());
    }

}

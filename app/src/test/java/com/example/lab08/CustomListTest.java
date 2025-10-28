package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {

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

}

package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class BuildingTest
{

    @Test
    public void ifABuildingIsCreatedWithTheId1TheIdGetterShouldReturn1()
    {
            Building building = new Building(1, "Johannes");
            assertEquals(1, building.getId());
    }
}

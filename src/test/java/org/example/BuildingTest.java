package org.example;

import static org.junit.Assert.*;

import org.junit.Test;

public class BuildingTest
{

    @Test
    public void ifABuildingIsCreatedWithTheId1TheIdGetterShouldReturn1()
    {
            Building building = new Building(1, "Johannes");
            assertEquals(1, building.getId());
    }

    @Test
    public void ifABuildingIsCreatedWithAResidentItShoudldReturnTheResident()
    {
        Building building = new Building(1, "Johannes");
        assertEquals("Johannes", building.getListofResidents()[0]);
    }
}

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
    public void ifABuildingIsCreatedWithAResidentItShouldContainOne()
    {
        Building building = new Building(1, "Johannes");
        assertEquals(1, building.getListofResidents().length);
    }

    @Test
    public void TheAPersonIsAddedItShouldBeInTHeListOfResidents()
    {
        Building building = new Building(1, "Johannes");
        building.addResident("John");
        assertEquals(2, building.getListofResidents().length);
    }

    @Test
    public void TheAPersonShouldNotBeAddedToTheListOfResidentsIfThePersonIsAlreadyIn()
    {
        Building building = new Building(1, "Johannes");
        building.addResident("Johannes");
        assertEquals(1, building.getListofResidents().length);
    }

    @Test
    public void AResidentShouldBeAbleToBeRemoved()
    {
        Building building = new Building(1, "Johannes");
        building.removeResident("Johannes");
        assertEquals(0, building.getListofResidents().length);
    }

    @Test
    public void AResidentShouldNotBeAbleToBeRemovedIfheIsntPartOfTheList()
    {
        Building building = new Building(1, "Johannes");
        building.removeResident("John");
        assertEquals(1, building.getListofResidents().length);
    }

    @Test
    public void TheIdShouldBeTheInputedValueIfAArrayOfResidentsIsAdded()
    {
        String[] residents = new String[]{"Johannes", "John", "Bob"};
        Building building = new Building(1, residents);
        assertEquals(1, building.getId());
    }

    @Test
    public void TheArrayOfResidentsReturnedShouldBeTheEqualToTheOnePutInIfNothingIsModified()
    {
        String[] residents = new String[]{"Johannes", "John", "Bob"};
        Building building = new Building(1, residents);
        assertEquals(residents, building.getListofResidents());
    }


    @Test
    public void TheArrayOfResidentsShouldNotIncreaseIfAResidentIsInTheInitialArray2Times()
    {
        String[] residents = new String[]{"Johannes", "John", "Bob", "John"};
        Building building = new Building(1, residents);
        assertEquals(3, building.getListofResidents().length);
    }

}

package org.example;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class Building
{
    private int id;

    public String[] getListofResidents()
    {
        return listofResidents.toArray(new String[listofResidents.size()]);
    }

    private ArrayList<String> listofResidents = new ArrayList<>();

    public Building(int idInput, String initialResident)
    {
        id = idInput;
        listofResidents.add(initialResident);
    }

    public Building(int idInput, String[] initialResidents)
    {
        id = idInput;
        for(String resident : initialResidents)
        {
            addResident(resident);
        }
    }

    public int getId()
    {
        return id;
    }

    public void addResident(String residentName)
    {
        if(!listofResidents.contains(residentName))
        {
            listofResidents.add(residentName);
        }
    }

    public void removeResident(String residentName)
    {
        listofResidents.remove(residentName);
    }
}

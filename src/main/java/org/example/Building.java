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
    }

    public Building(int idInput, String[] initialResident)
    {

    }

    public int getId()
    {
        return id;
    }
}

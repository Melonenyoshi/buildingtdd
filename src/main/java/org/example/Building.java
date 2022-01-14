package org.example;

import java.util.LinkedList;

/**
 * Hello world!
 *
 */
public class Building
{
    private int id;
    private LinkedList<String> ListofResidents = new LinkedList<>();

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

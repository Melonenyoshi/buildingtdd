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

    public Building(int id, String initialResident)
    {

    }

    public Building(int id, String[] initialResident)
    {

    }

    public int getId()
    {
        return id;
    }
}

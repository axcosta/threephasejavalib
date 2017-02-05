package org.threephasejavalib;

/**
 * Copyright (C) 2003 - A X Costa
 * Filename: CalendarEntry.java
 * Project: ThreePhaseJavaLib
 *
 * @author axcosta@gmail.com
 * @version 2.0
 * @since 1.0
 * Begin: 15th August 2003
 * Last Modification: 4th February 2017
 *
 * An entry in the Calendar class
 *
 * All rights reserved.
 **/
public class CalendarEntry {
    // constant(s)

    // field(s)
    private EntityBase entity;
    private int timeCell = 0;
    private BEvent nextB;

    // event(s)

    // constructor(s)
    protected CalendarEntry()
    {

    }
    protected CalendarEntry (EntityBase newEntity, BEvent newNextB, int newNextTime)
    {
        entity = newEntity;
        timeCell = newNextTime;
        nextB = newNextB;
    }
    // method(s)

    // property(ies)

    /**
    * Entity (reference to an Entity object)
    **/
    EntityBase getEntity()
    {
        return entity;
    }
    void setEntity (EntityBase value)
    {
        entity = value;
    }
    /**
    * Time of Entity change of state
    **/
    public int TimeCell
    {
        get
        {
            return timeCell;
        }
        set
        {
            timeCell = value;
        }
    }
    /**
    * sets/returns a B Event to be executed
    **/
    public BEvent NextB
    {
        get
        {
            return nextB;
        }
        set
        {
            nextB = value;
        }
    }
}

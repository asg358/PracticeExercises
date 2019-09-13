package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

public class DaysOfTheWeekTest {

    private static DaysOfTheWeek daysOfTheWeek;
    @Before
    public void setUp() throws Exception {
        daysOfTheWeek=new DaysOfTheWeek();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void computeFirstDay_DateGiven_ShouldReturnCorrectFirstDay() {

        Date date = new Date(2323223232L);
        SimpleDateFormat formatter = new SimpleDateFormat("E MM/dd/yyyy");
        //String strDate= formatter.format(date);
        String expected= "Mon 26/01/1970";

        assertEquals(expected,daysOfTheWeek.computeFirstDay(date));
        assertNotNull(daysOfTheWeek.computeFirstDay(date));
    }

    @Test
    public void computeLastDay_DateGiven_ShouldReturnCorrectLastDay() {

        Date date = new Date(2323223232L);
        SimpleDateFormat formatter = new SimpleDateFormat("E MM/dd/yyyy");
        //String strDate= formatter.format(date);
        String expected= "Sun 01/02/1970";

        assertEquals(expected,daysOfTheWeek.computeLastDay(date));
        assertNotNull(daysOfTheWeek.computeLastDay(date));

    }
}
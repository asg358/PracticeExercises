package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentRecordTest {

    private static StudentRecord studentRecord;
    @Before
    public void setUp() throws Exception {

        studentRecord=new StudentRecord();

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test(expected=ArithmeticException.class)
    public void getInput_GetOutofRangeGradesInputFromUser_ShouldThrowException() throws Exception {

        System.out.println("Testing whether exception is thrown by getInput method or not");
        studentRecord.getInput();
    }

}
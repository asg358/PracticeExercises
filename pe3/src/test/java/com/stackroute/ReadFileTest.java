package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static org.junit.Assert.*;

public class ReadFileTest {

    private static ReadFile readFile;
    @Before
    public void setUp() throws Exception {
        readFile=new ReadFile();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void readFile_FileNameGiven_ShouldReturnCorrectTextAndLength() throws IOException {

        FileWriter fw=new FileWriter("Demo.txt");
        fw.write("Hello World");
        fw.close();
        String expected[][]={{"HELLO WORLD"},{"11"}};

        assertEquals(expected,readFile.readFile("demo.txt"));
        assertNotNull(readFile.readFile("demo.txt"));

    }
}
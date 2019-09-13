package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

import static org.junit.Assert.*;

public class CountWordsTest {

    private static CountWords countWords;
    @Before
    public void setUp() throws Exception {

       countWords=new CountWords();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void computeWordFrequency_FileNameGiven_ShouldReturnHashMapWithWordsCount() throws IOException {

        FileWriter fw=new FileWriter("FileDemo.txt");
        fw.write("i am a man,\n i like to sleep,\n i have a home");
        fw.close();

        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("i", 3);
        expected.put("am", 1);
        expected.put("a", 2);
        expected.put("man",1 );
        expected.put("like",1 );
        expected.put("to", 1);
        expected.put("sleep", 1);
        expected.put("have", 1);
        expected.put("home", 1);

        assertEquals(expected,countWords.computeWordFrequency("FileDemo.txt"));
        assertNotNull(countWords.computeWordFrequency("FileDemo.txt"));

    }
}
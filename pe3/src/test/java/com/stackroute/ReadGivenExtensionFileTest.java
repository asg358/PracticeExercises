package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReadGivenExtensionFileTest {

    private static ReadGivenExtensionFile readGivenExtensionFile;
    @Before
    public void setUp() throws Exception {
        readGivenExtensionFile=new ReadGivenExtensionFile();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void readGivenExtensionFile_SearchGivenExtensionFile_ShouldReturnCorrectOutput() {

        String extension1="txt";
        String extension2="csv";
        byte[] expected={65,66,67,68};

        assertEquals(expected,readGivenExtensionFile.readGivenExtensionFile(extension1));
        assertEquals(expected,readGivenExtensionFile.readGivenExtensionFile(extension2));
        assertNotNull(readGivenExtensionFile.readGivenExtensionFile(extension1));
    }
}
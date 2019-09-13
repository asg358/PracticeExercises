package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdditionOfMatrixTest{
    private static AdditionOfMatrix additionOfMatrix;
    @Before
    public void setUp() throws Exception {

        additionOfMatrix=new AdditionOfMatrix();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void computeSum_TwoMatricesGiven_ReturnCorrectSum() {

    int A[][]={{1,2},{3,4},{5,6}};
    int B[][]={{9,8},{7,6},{5,4}};
    int C[][]={{10,10},{10,10},{10,10}};
    int D[][]={{11,12},{13,14},{15,16}};
    assertArrayEquals(C,additionOfMatrix.computeSum(A,B));
    assertArrayEquals(D,additionOfMatrix.computeSum(A,B));
    assertNotNull(additionOfMatrix.computeSum(A,B));
    assertNotNull(additionOfMatrix.computeSum(A,C));

    }
}
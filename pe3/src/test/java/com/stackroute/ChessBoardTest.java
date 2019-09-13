package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ChessBoardTest {
    private  static ChessBoard chessBoard;
    @Before
    public void setUp() throws Exception {
        chessBoard=new ChessBoard();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void createChessBoard_ShouldReturnCorrectChessBoardPattern() {

        String[][] expected ={{"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
                {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
                {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
                {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
                {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
                {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
                {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
                {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"}};

        assertArrayEquals(expected ,chessBoard.createChessBoard());
        assertNotNull(chessBoard.createChessBoard());
        //System.out.println(Arrays.toString(chessBoard.createChessBoard()));

    }
}
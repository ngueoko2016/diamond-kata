package org.diamon;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;


public class DiamondTest {

    Diamond diamond;

    @BeforeEach
    void setUp(){
        diamond=new Diamond();
    }

    @Test
    void testBuildDiamondPrintA(){
        diamond.setInput('A');
        System.out.println((int)'A');
        diamond.buildDiamondToPrint();
        diamond.diamondPrint();
       assertAll(()-> assertTrue(diamond.getOutput().get(0).contains("A")));
    }
    @Test
    void testBuildDiamondPrintB(){
        diamond.setInput('B');
        diamond.buildDiamondToPrint();
        diamond.diamondPrint();
        assertAll(()-> assertTrue(diamond.getOutput().get(1).contains("A")),
                ()->assertTrue(diamond.getOutput().get(0).contains("B B")));
    }
    @Test
    void testBuildDiamondPrintC(){
        diamond.setInput('C');
        diamond.buildDiamondToPrint();
        diamond.diamondPrint();
        assertAll(()-> assertTrue(diamond.getOutput().get(2).contains("A")),
                    ()->assertTrue(diamond.getOutput().get(1).contains("B B")),
                    ()->assertTrue(diamond.getOutput().get(0).contains("C   C")));
    }
    @Test
    @DisplayName("When given any Alphabetic character")
    void testBuildDiamondPrintD(){
        diamond.setInput('D');
        diamond.buildDiamondToPrint();
        diamond.diamondPrint();
        assertAll(()-> assertTrue(diamond.getOutput().get(3).contains("A")),
                ()->assertTrue(diamond.getOutput().get(2).contains("B B")),
                ()->assertTrue(diamond.getOutput().get(1).contains("C   C")),
                ()-> assertTrue(diamond.getOutput().get(0).contains("D     D")));
    }
    @Test
    @DisplayName("When given any Alphabetic character")
    void testBuildDiamondPrintAny(){
        diamond.setInput('H');
        diamond.buildDiamondToPrint();
        diamond.diamondPrint();
       // assertEquals(diamond.getOutput().size(),diamond.getInputAlphabeticOrder());
    }

}

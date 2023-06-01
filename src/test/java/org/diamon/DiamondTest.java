package org.diamon;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
       assertAll(()-> assertEquals(diamond.getOutput().size(),1));
    }
    @Test
    void testBuildDiamondPrintB(){
        diamond.setInput('B');
        diamond.buildDiamondToPrint();
        diamond.diamondPrint();
        assertEquals(diamond.getOutput().size(),diamond.getInputAlphabeticOrder());
    }
    @Test
    void testBuildDiamondPrintC(){
        diamond.setInput('C');
        diamond.buildDiamondToPrint();
        diamond.diamondPrint();
        assertEquals(diamond.getOutput().size(),3);
    }
    @Test
    @DisplayName("When given any Alphabetic character")
    void testBuildDiamondPrintD(){
        diamond.setInput('D');
        diamond.buildDiamondToPrint();
        diamond.diamondPrint();
        assertEquals(diamond.getOutput().size(),diamond.getInputAlphabeticOrder());
    }
    @Test
    @DisplayName("When given any Alphabetic character")
    void testBuildDiamondPrintAny(){
        diamond.setInput('F');
        diamond.buildDiamondToPrint();
        diamond.diamondPrint();
        assertEquals(diamond.getOutput().size(),diamond.getInputAlphabeticOrder());
    }

}

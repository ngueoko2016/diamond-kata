package org.diamon;

import org.junit.jupiter.api.BeforeEach;
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
        diamond.setInput("A");
        diamond.buildDiamondToPrint();
        diamond.diamondPrint();
       assertAll(()-> assertEquals(diamond.getOutput().size(),1));
    }
    @Test
    void testBuildDiamondPrintB(){
        diamond.setInput("B");
        diamond.buildDiamondToPrint();
        diamond.diamondPrint();
        assertEquals(diamond.getOutput().size(),2);
    }
    @Test
    void testBuildDiamondPrintC(){
        diamond.setInput("C");
        diamond.buildDiamondToPrint();
        diamond.diamondPrint();
        assertEquals(diamond.getOutput().size(),3);
    }

}

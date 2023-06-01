package org.diamon;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class DiamondTest {

    Diamond diamond;

    @BeforeEach
    void setUp(){
        diamond=new Diamond("A");
    }

    @Test
    void testBuildDiamondPrint(){
        diamond.buildDiamondToPrint();
        System.out.println(diamond.input);
        assertTrue(diamond.output.equals("A"));
    }

}

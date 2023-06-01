package org.diamon;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DiamondTest {

    Diamond diamond;

    @BeforeEach
    void setUp(){
        diamond=new Diamond("A");
    }

    @Test
    void testDiamondPrint(){
        System.out.println(diamond.input);
    }

}

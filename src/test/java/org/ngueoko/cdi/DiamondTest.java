package org.ngueoko.cdi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DiamondTest {

    Diamond diamond;

    @BeforeEach
    void setUp(){
        diamond=new Diamond("a");
    }

    @Test
    void printDiamond(){
        System.out.println("A");
    }

}

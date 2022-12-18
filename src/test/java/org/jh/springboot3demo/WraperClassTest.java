package org.jh.springboot3demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WraperClassTest {

    @Test
    void testIntegerEquality(){
        int i = 1;
        Integer integerWrapper = new Integer(1);
        Integer intOf = Integer.valueOf(1);

        assertTrue( i == integerWrapper);
        assertTrue( integerWrapper.intValue() == intOf.intValue() );
        assertTrue( i == intOf );
    }
}

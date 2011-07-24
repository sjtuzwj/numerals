package com.programmisty.numerals;

import java.math.BigDecimal;
import java.math.BigInteger;
import junit.framework.TestCase;

/**
 *
 * @author vit
 */
public class EnglishTest extends TestCase {
    
    public EnglishTest(String testName) {
        super(testName);
    }

    /**
     * Test of format method, of class English.
     */
    public void testFormat() {
        English en = new English();
        assertEquals("one", en.format(1));
        assertEquals("two", en.format(2));
        assertEquals("three", en.format(3));
        assertEquals("four", en.format(4));
        assertEquals("five", en.format(5));
        assertEquals("six", en.format(6));
        assertEquals("seven", en.format(7));
        assertEquals("eight", en.format(8));
        assertEquals("nine", en.format(9));
        assertEquals("ten", en.format(10));
        assertEquals("eleven", en.format(11));
        assertEquals("twelve", en.format(12));
        assertEquals("one hundred", en.format(100));
    }

    public void testAmount() {
        English en = new English();
        assertEquals("One hundred and 99/100", en.amount(new BigDecimal("100.99")));
    }

}

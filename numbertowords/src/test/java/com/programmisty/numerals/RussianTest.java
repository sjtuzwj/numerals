package com.programmisty.numerals;

import java.math.BigDecimal;
import java.math.BigInteger;
import junit.framework.TestCase;
import static com.programmisty.numerals.Russian.*;

/**
 *
 * @author vit
 */
public class RussianTest extends TestCase {

    public RussianTest(String testName) {
        super(testName);
    }

    public void testTisyachi() {
        assertEquals("тысяча", tisyachi(0, 0, 1));
        assertEquals("тысячи", tisyachi(0, 0, 2));
        assertEquals("тысячи", tisyachi(0, 0, 3));
        assertEquals("тысяч", tisyachi(0, 0, 5));

        assertEquals("тысяч", tisyachi(1, 0, 0));
        assertEquals("тысяча", tisyachi(0, 0, 1));
        assertEquals("тысяча", tisyachi(0, 4, 1));
        assertEquals("тысяч", tisyachi(0, 7, 7));
        assertEquals("тысяч", tisyachi(0, 1, 3));
        assertEquals("тысяч", tisyachi(1, 1, 1));
        assertEquals("тысячи", tisyachi(1, 2, 2));
        assertEquals("тысяча", tisyachi(1, 2, 1));

        assertEquals("тысячи", tisyachi(0, 0, 4));
        assertEquals("тысячи", tisyachi(0, 0, 3));
        assertEquals("тысяча", tisyachi(1, 0, 1));
        assertEquals("тысячи", tisyachi(1, 0, 2));
    }

    public void testFormat() {
        Russian r = new Russian();

        assertEquals("ноль", r.format(0));
        assertEquals("один", r.format(1));
        assertEquals("два", r.format(2));
        assertEquals("три", r.format(3));
        assertEquals("четыре", r.format(4));
        assertEquals("пять", r.format(5));
        assertEquals("шесть", r.format(6));
        assertEquals("семь", r.format(7));
        assertEquals("восемь", r.format(8));
        assertEquals("девять", r.format(9));
        assertEquals("десять", r.format(10));

        assertEquals("две тысячи", r.format(2000));
        assertEquals("одна тысяча", r.format(1000));
        assertEquals("четыре тысячи", r.format(4000));
        assertEquals("сто двадцать две тысячи", r.format(122000));
        assertEquals("сто двадцать одна тысяча", r.format(121000));
        assertEquals("одиннадцать тысяч", r.format(11000));

        assertEquals("один триллион", r.format(new BigInteger("1000000000000")));
        assertEquals("десять триллионов", r.format(new BigInteger("10000000000000")));
        assertEquals("сто триллионов", r.format(new BigInteger("100000000000000")));
        assertEquals("сто квадриллионов", r.format(new BigInteger("100000000000000000")));
        assertEquals("сто миллионов", r.format(new BigInteger("100000000")));

    }

    public void testAmount() {
        Russian ru = new Russian();
        assertEquals("Сто рублей 99 копеек", ru.amount(new BigDecimal("100.99")));
    }
}

package sample;
/*
 * Copyright (C) 2011 Vit <vitalker@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
import java.math.BigDecimal;
import java.math.BigInteger;
import static com.programmisty.numerals.Numerals.*;

public class ConsoleSample {

    public static void main(String[] args) {
        // one hundred twenty-three
        System.out.println(english(123));

        //one hundred twenty-three thousand four hundred fifty-six
        System.out.println(english(new BigInteger("123456")));

        //Ninety-nine and 89/100
        System.out.println(amount(new BigDecimal("99.89")));

        // Russian. Rubles test.
        System.out.println(russianRubles(new BigDecimal("777.77")));
        // Russian. Number test.
        System.out.println(russian(new BigInteger("122000")));
    }
}

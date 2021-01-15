package exercise_3_roman_number;

import org.junit.Test;
import static org.junit.Assert.*;

public class NumberConvertTests {

    @Test
    public void testIntToRoman() {

        NumberConvert converter = new NumberConvert();
        // Specials Validate Greater than 5000
        assertEquals("ERROR", converter.toRoman(5000));
        // Specials Validate zero
        assertEquals("", converter.toRoman(0));
        // First evaluate roman keys
        assertEquals("I", converter.toRoman(1));
        assertEquals("IV", converter.toRoman(4));
        assertEquals("IX", converter.toRoman(9));
        assertEquals("X", converter.toRoman(10));
        assertEquals("XL", converter.toRoman(40));
        assertEquals("L", converter.toRoman(50));
        assertEquals("XC", converter.toRoman(90));
        assertEquals("C", converter.toRoman(100));
        assertEquals("CD", converter.toRoman(400));
        assertEquals("D", converter.toRoman(500));
        assertEquals("CM", converter.toRoman(900));
        assertEquals("M", converter.toRoman(1000));

        // Evaluate range 1-20 without num keys
        assertEquals("II", converter.toRoman(2));
        assertEquals("III", converter.toRoman(3));
        assertEquals("V", converter.toRoman(5));
        assertEquals("VI", converter.toRoman(6));
        assertEquals("VII", converter.toRoman(7));
        assertEquals("VIII", converter.toRoman(8));
        assertEquals("XI", converter.toRoman(11));
        assertEquals("XII", converter.toRoman(12));
        assertEquals("XIII", converter.toRoman(13));
        assertEquals("XIV", converter.toRoman(14));
        assertEquals("XV", converter.toRoman(15));
        assertEquals("XVI", converter.toRoman(16));
        assertEquals("XVII", converter.toRoman(17));
        assertEquals("XVIII", converter.toRoman(18));
        assertEquals("XIX", converter.toRoman(19));
        // Evaluate tens without roman keys
        assertEquals("XX", converter.toRoman(20));
        assertEquals("XXX", converter.toRoman(30));
        assertEquals("LX", converter.toRoman(60));
        assertEquals("LXX", converter.toRoman(70));
        assertEquals("LXXX", converter.toRoman(80));
        // Evaluate hundreds without roman keys
        assertEquals("CC", converter.toRoman(200));
        assertEquals("CCC", converter.toRoman(300));
        assertEquals("DC", converter.toRoman(600));
        assertEquals("DCC", converter.toRoman(700));
        assertEquals("DCCC", converter.toRoman(800));

        // Evaluate thousands without roman keys
        assertEquals("MM", converter.toRoman(2000));
        assertEquals("MMM", converter.toRoman(3000));

        assertEquals("XXXIX", converter.toRoman(39));
        assertEquals("XLIX", converter.toRoman(49));
        assertEquals("LXXXVIII", converter.toRoman(88));
        assertEquals("LXXXIX", converter.toRoman(89));
        assertEquals("XCIX", converter.toRoman(99));
        assertEquals("CDXXXIX", converter.toRoman(439));
        assertEquals("CDXLIX", converter.toRoman(449));
        assertEquals("CDL", converter.toRoman(450));
        assertEquals("CDLXXXVIII", converter.toRoman(488));
        assertEquals("CDLXXXIX", converter.toRoman(489));
        assertEquals("CDXCIX", converter.toRoman(499));
        assertEquals("DXXXIX", converter.toRoman(539));
        assertEquals("DXLIX", converter.toRoman(549));
        assertEquals("DL", converter.toRoman(550));
        assertEquals("DLXXXVIII", converter.toRoman(588));
        assertEquals("DLXXXIX", converter.toRoman(589));
        assertEquals("DXCIX", converter.toRoman(599));
        assertEquals("DCCCXXXIX", converter.toRoman(839));
        assertEquals("DCCCXLIX", converter.toRoman(849));
        assertEquals("DCCCL", converter.toRoman(850));
        assertEquals("DCCCLXXXVIII", converter.toRoman(888));
        assertEquals("DCCCLXXXIX", converter.toRoman(889));
        assertEquals("DCCCXCIX", converter.toRoman(899));
        assertEquals("CMXXXIX", converter.toRoman(939));
        assertEquals("CMXLIX", converter.toRoman(949));
        assertEquals("CML", converter.toRoman(950));
        assertEquals("CMLXXXVIII", converter.toRoman(988));
        assertEquals("CMLXXXIX", converter.toRoman(989));
        assertEquals("CMXCIX", converter.toRoman(999));

    }
}
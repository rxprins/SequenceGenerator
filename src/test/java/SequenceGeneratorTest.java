
import org.junit.Test;

import static org.junit.Assert.*;


/**
 * Created by rianaprins on 2/8/16.
 */
public class SequenceGeneratorTest {

    @Test
    public void testPrintSequence() {
        SequenceGenerator sequenceGenerator = new SequenceGenerator();
        String expected = ("3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 ");
        assertEquals("Print numbers : ",expected,sequenceGenerator.printSequence(3,19,true,false));
        String expectedL = ("a b c d e f ");
        assertEquals("Print numbers : ",expectedL,sequenceGenerator.printSequence('a','f',false,false));
        String expectedO = ("5 7 9 11 13 ");
        assertEquals("Print numbers : ",expectedO,sequenceGenerator.printSequence(4,13,true,true));

    }
}
/*     
 * This Java source file was generated by the Gradle 'init' task.
 */
package Unit_testing_cw;

import org.junit.Test;
import static org.junit.Assert.*;

public class cw1test {
    //Testing normal values (standard values in the range of input )
    @Test public void D2Htest1() {
        assertEquals("Hexadecimal representation is: 5", Dec2Hex.Dec2HexConv(new String[] {"5"}));
    }
    @Test public void D2Htest2() {
        assertEquals("Hexadecimal representation is: A", Dec2Hex.Dec2HexConv(new String[] {"10"}));
    }	
    @Test public void D2Htest3() {
        assertEquals("Hexadecimal representation is: B", Dec2Hex.Dec2HexConv(new String[] {"11"}));
    }
    @Test public void D2Htest4() {
        assertEquals("Hexadecimal representation is: D",Dec2Hex.Dec2HexConv(new String[]{"13"}));
    }
    @Test public void D2Htest5() {
        assertEquals("Hexadecimal representation is: 9", Dec2Hex.Dec2HexConv(new String[] {"9"}));
    }
   //Testing extreme values (Values at the outside limits of the programs acceptable range)
    @Test public void D2Htest10() {
        assertEquals("Hexadecimal representation is: 1", Dec2Hex.Dec2HexConv(new String[] {"1"}));
    }

    @Test public void D2Htest11() {
        assertEquals("Hexadecimal representation is: 3B9AC9FF", Dec2Hex.Dec2HexConv(new String[] {"999999999"}));
    }

    @Test public void D2Htest12() {
        assertEquals("Hexadecimal representation is: D6D8", Dec2Hex.Dec2HexConv(new String[] {"55000"}));
    }
    @Test public void D2Htest13() {
        assertEquals("Hexadecimal representation is: F4240", Dec2Hex.Dec2HexConv(new String[] {"1000000"}));
    }
    //Testing exceptional values (Values outside the range of the acceptable input)
    //this tests the task 5 requirement for when no input is provided
    @Test public void D2Htest6() {
        assertEquals("No entry made, please enter an integer",Dec2Hex.Dec2HexConv(new String[0]));
   }
    //the following tests handle the other task 5 requirement of when a non integer is supplied
    @Test public void D2Htest7() {
        assertEquals("The entered value exists outwith the current bounds of the system, please enter an integer",Dec2Hex.Dec2HexConv(new String[]{"SSada2dax-"}));
   }
    @Test public void D2Htest8() {
        assertEquals("The entered value exists outwith the current bounds of the system, please enter an integer", Dec2Hex.Dec2HexConv(new String[] {"ubaid"}));
    }
    @Test public void D2Htest9() {
        assertEquals("The entered value exists outwith the current bounds of the system, please enter an integer", Dec2Hex.Dec2HexConv(new String[] {"*sa234"}));
    }


}

package basiclibrary;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RollingDiceTest {
    @Test
    public void testRoll() {
        RollingDice rolling = new RollingDice();
        int[] output = rolling.roll(10000); //following along with code review. This test number has enough rolls to ensure one of each result
        int ones = 0;
        int twos = 0;
        int threes = 0;
        for(int i = 0; i < output.length; i++) {
            if (output[i] == 1) {
                ones++;
            }
            if (output[i] == 2) {
                twos++;
            }
            if (output[i] == 3) {
                threes++;
            }
        }
        assertTrue("there should be at least one 1", ones >0);
        assertTrue("there should be at least one 2", twos >0);
        assertTrue("there should be at least one 3", threes >0);
        assertEquals("the length should be 10000", 10000, output.length);
    }
}

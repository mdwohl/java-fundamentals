package basiclibrary;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AveragesTest {
    @Test public void testAverageArrays(){
        int[] testArray = {1,2,3,4,5,6,7};
        Averages averages = new Averages();
        double expected = 4.0;
        double averagesOutput = averages.calculateAvg(testArray);
        assertTrue("this average was not expected: ", averagesOutput == 4.0);
    }
}

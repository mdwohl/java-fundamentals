package basiclibrary;

import org.junit.Test;

import static org.junit.Assert.*;


public class ContainsDuplicatesTest {
    @Test
    public void testContainsDuplicates(){
        ContainsDuplicates contDup = new ContainsDuplicates();

        assertTrue("this one does", contDup.containsDuplicates(new int[]{1,2,1}));
        assertFalse("this does not", contDup.containsDuplicates((new int[]{1,2,3,4,5})));


    }
}

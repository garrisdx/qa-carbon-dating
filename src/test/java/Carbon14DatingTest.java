import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Carbon14DatingTest {
    //#1 Build a test for calculateAge();

    /*
        #2 Build a test for setRemainingAmount() in the
        scenario the given remaining value is <= 1.
    */
    @Test
    @DisplayName("test remaining amount setter with remainder less than 1")
    public void testSetterRemainingAmtLessThan1(){
        Carbon14Dating test = new Carbon14Dating(0.7);
        assertEquals(1, test.getRemainingAmount());
    };

   /*
        #3 Build a test for setRemainingAmount() in the
        scenario the given remaining value is >= 1.
    */
    @Test
    @DisplayName("test remaining amount setter with remainder greater than or equal to 1")
    public void testSetterRemainingAmtRemainGrtOrEqu1(){
        Carbon14Dating test = new Carbon14Dating(1);
        assertEquals(1, test.getRemainingAmount());
    };


    // #4 Build a test for the toString() method.
}

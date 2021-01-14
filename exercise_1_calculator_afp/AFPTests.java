package exercise_1_calculator_afp;

import org.junit.Test;
import static org.junit.Assert.*;

public class AFPTests {

    @Test
    public void whitdrawMoneyTest() {
        AFP afp = new AFP();
        // final String ERROR = "ERROR";
        // fail(ERROR);
        assertEquals(0, afp.withdrawMoney(-100));
        assertEquals(0, afp.withdrawMoney(0));
        assertEquals(500000, afp.withdrawMoney(500000));
        assertEquals(1000000, afp.withdrawMoney(1000000));
        assertEquals(1000000, afp.withdrawMoney(5000000));
        assertEquals(2000000, afp.withdrawMoney(20000000));
        assertEquals(4300000, afp.withdrawMoney(50000000));
    }
}
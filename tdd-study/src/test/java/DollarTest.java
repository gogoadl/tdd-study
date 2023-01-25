import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DollarTest {

    @Test
    void times() {
        Dollar dollar = new Dollar(5);
        dollar.times(2);
        assertEquals(10, dollar.amount);
    }
}
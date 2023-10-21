package money;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

// import org.junit.Assert;

public class DollarTest {
    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(10, product.amount);
    }
}

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.Arrays;

public class OrderTest {

    @Test
    public void testAddItem() {
        Order order = new Order(Arrays.asList("Item1"), 10.0);
        order.addItem("Item2", 15.0);
        assertEquals(25.0, order.getTotal(), "Total should be updated when an item is added");
    }

    @Test
    public void testRemoveItem() {
        Order order = new Order(Arrays.asList("Item1", "Item2"), 25.0);
        order.removeItem("Item1", 10.0);
        assertEquals(15.0, order.getTotal(), "Total should be updated when an item is removed");
    }
}

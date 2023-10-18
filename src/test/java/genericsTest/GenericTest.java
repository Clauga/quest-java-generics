package genericsTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import genericsProyect.GenericList;

public class GenericTest {
    @Test
    public void testAddAndGet() {
        GenericList<String> list = new GenericList<String>();
        list.add("Hello");
        list.add("World");
        assertEquals("Hello", list.get(0));
        assertEquals("World", list.get(1));
    }
    @Test
    public void testSize() {
        GenericList<Integer> IntegerList = new GenericList<>();
        IntegerList.add(1);
        IntegerList.add(2);

        assertEquals(2, IntegerList.size());
    }
    @Test
    public void testNullValue() {
        GenericList<Double> doubleList = new GenericList<>();
        doubleList.add(null);

        assertNull(doubleList.get(0));
    }
}

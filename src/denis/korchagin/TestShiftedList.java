package denis.korchagin;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestShiftedList {

    @Test
    public void testGetShiftedList1() {
        List<Integer> result = Main.createShiftedList(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7)), 3);
        assertEquals(new ArrayList<>(Arrays.asList(5, 6, 7, 1, 2, 3, 4)), result);
    }

    @Test
    public void testGetShiftedList2() {
        List<Integer> result = Main.createShiftedList(new ArrayList<>(Arrays.asList(7, 4, 1, -2, -5, -8)), -2);
        assertEquals(new ArrayList<>(Arrays.asList(1, -2, -5, -8, 7, 4)), result);
    }

    @Test
    public void testGetShiftedList3() {
        List<Integer> result = Main.createShiftedList(new ArrayList<>(Arrays.asList(10, 11, 12, 13, 14, 15)), 0);
        assertEquals(new ArrayList<>(Arrays.asList(10, 11, 12, 13, 14, 15)), result);
    }

    @Test
    public void testGetShiftedList4() {
        List<Integer> result = Main.createShiftedList(new ArrayList<>(Arrays.asList(7, 6, 5, 4, 3)), 5);
        assertEquals(new ArrayList<>(Arrays.asList(7, 6, 5, 4, 3)), result);
    }
}

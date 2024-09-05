import java.util.List;
import java.util.ArrayList;
import org.junit.Test;
import  static org.junit.Assert.*;
public class mainTest {
    @Test
    public void testRemoveElement(){
        List<Integer> r = new ArrayList<>();
        r.add(1);
        r.remove(0);
        boolean empty = r.isEmpty();
        assertTrue(empty);
    }
}

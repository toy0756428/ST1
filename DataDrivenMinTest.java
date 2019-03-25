import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.*;
import java.util.*;


@RunWith(value = Parameterized.class)
public class DataDrivenMinTest {

        private String a;
        private String b;
        private String expected;

        public DataDrivenMinTest(String a, String b, String expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

        @Parameters
        public static Iterable<Object[]> data1() {
          return Arrays.asList(new Object[][] {{"apple", "cat", "apple"}, {"dog", "red", "dog"}});
        }

        @Test
        @SuppressWarnings ("unchecked")
        public void testmin() {
        LinkedList list = new LinkedList();
        list.add(a);
        list.add(b);
        assertEquals (expected, Min.min(list));
    }


}


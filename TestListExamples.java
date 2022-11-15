import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class TestListExamples {
  // Write your grading tests here!
  @Test
    public void testFilter() {
        List<String> test = new ArrayList<String>();
        test.add("Guuci");
        test.add("Good");
        test.add("Great");
        List<String> expect = new ArrayList<String>();
        expect.add("Guuci");
        expect.add("Great");
        List<String> result = ListExamples.filter(test, new LongString());
        assertEquals(expect, result);
    }
}

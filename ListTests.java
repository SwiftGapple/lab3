import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class ListTests {
    @Test
    public void ListExampleFilter(){
        List<String> testString1 = new ArrayList<>();

        testString1.add("fun");
        testString1.add("notfun");
        testString1.add("nice");

        List<String> result = new ArrayList<>();
        result.add("fun");
        result.add("fun");

        StringChecker sc = new ListStringChecker();

        assertArrayEquals(result.toArray(), ListExamples.filter(testString1, sc).toArray());
    }
}

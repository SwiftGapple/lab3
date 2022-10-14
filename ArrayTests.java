  import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = {3, 2, 1};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{1,2,3}, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed02(){
    int[] input2 = {1, 2, 3};
    int[] input2Reversed = {3, 2, 1};

    assertArrayEquals(input2Reversed, ArrayExamples.reversed(input2));
    assertArrayEquals(new int[]{1, 2, 3}, input2);
  }

  @Test
  public void testavgwithoutLowest(){
    double[] input2Reversed = {3, 2, 1};

    assertEquals(ArrayExamples.averageWithoutLowest(input2Reversed),2.5, 0.11);
  }
}

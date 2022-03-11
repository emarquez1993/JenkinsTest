import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberAddTest {
	
	NumberAdd na = new NumberAdd();
	
	@Test
	public void testCase1()
	{
		Assertions.assertEquals(3, na.add(1, 2));
	}
	
	@Test
	public void testCase2()
	{
		Assertions.assertEquals(45, na.add(1, 1));
	}
}

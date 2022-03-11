import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberAddTest {
	
	NumberAdd na = new NumberAdd();
	
	@Test
	public void testCase1()
	{
		Assertions.assertEquals(3, na.add(1, 2));
	}
}

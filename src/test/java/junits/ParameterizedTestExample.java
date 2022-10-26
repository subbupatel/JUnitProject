package junits;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTestExample {

	@ValueSource(strings = {"RADAR", "MOM", "DAD"})
	@ParameterizedTest
	public void Test1(String arg1)   {
		
		assertTrue(StringFunctions.ispalindrom(arg1));
	}
	
	@CsvSource(value = {"RADAR:MOM:DAD"}, delimiter = ':')
	@ParameterizedTest
	public void Test2(String arg1, String arg2, String arg3)   {
		
		assertEquals(arg1,arg2,arg3);
	}

	private void assertEquals(String arg1, String arg2, String arg3) {
		// TODO Auto-generated method stub
		
	}

	
}

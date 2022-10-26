package junits;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class StringFunctionsTest {
	
	@Test
	public void Test1() {
		
		assertTrue(StringFunctions.ispalindrom("RADAR"));
	
	}

	@Test
	public void Test2() {
		
		assertFalse(StringFunctions.ispalindrom("PRIYA"));
	}

	@DisplayName("Example of Repeated Test")
	@RepeatedTest(4)
	@Test
	public void Test3() {
		
		assertTrue(StringFunctions.ispalindrom("MOM"));
	}
	
	}





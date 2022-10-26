package pkgA;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import junits.StringFunctions;

@Tag("Sanity")
public class PkgATest {

	@Test
	@DisplayName("part of pkg a")
	public void Test1() {
		
		assertTrue(StringFunctions.ispalindrom("RADAR"));
	
	}
	@Test
	@DisplayName("part of pkg a")
	public void Test2() {
		
		assertTrue(StringFunctions.ispalindrom("RADAR"));
	
}
}
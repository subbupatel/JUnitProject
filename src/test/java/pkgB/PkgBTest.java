package pkgB;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import junits.StringFunctions;

@Tag("Sanity")
public class PkgBTest {

	@Test
	@DisplayName("part of pkg b")
	public void Test1() {
		
		assertTrue(StringFunctions.ispalindrom("RADAR"));
	
	}

}

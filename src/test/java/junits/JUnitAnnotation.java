package junits;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JUnitAnnotation {

	@BeforeAll
	public static void beforeall()  {
		System.out.println("Before All");
	}
	@BeforeEach
	public void beforejunit()  {
		System.out.println("Before JUnit");
	}
	@Test
	public void Test1(){
		
		assertEquals(11,Calculator.Add(5,  6));
	}
	

	@AfterEach
	public void afterjunit()  {
		System.out.println("After JUnit");
	}
	@AfterAll
	public static void afterall()  {
		System.out.println("After All");
	}
}

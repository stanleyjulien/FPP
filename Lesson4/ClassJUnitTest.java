package lesson4;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClassJUnitTest {

	@Test
	// Implement test to check for minimum character
	public void test() 
	{
		//RecursiveMinChar min = new RecursiveMinChar();
		char originatedOutput = RecursiveMinChar.minChar("akel");
		char expectedOutput = 'a';
		assertEquals(expectedOutput, originatedOutput);
		
	}
	// End of test for minimum character
	
	@Test
	// Implement test to merge two string in alphabetic order
	public void test2()
	{
		//RecursiveMergeString ms = new RecursiveMergeString();
		String originatedOutput = RecursiveMergeString.mString("ace", "bdf");
		String expectedOutput = "abcdef";
		assertEquals(expectedOutput, originatedOutput);
		
	}

}

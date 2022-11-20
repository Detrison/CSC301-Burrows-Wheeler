package Main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
// author <Dean>
class test extends Main{

	
	@Test
	
	//Test pulls off a normal transformation
	public void Basictest() {
		String test = "BANANA";
		System.out.println("Our word " + test);
		String expected = "ANNB$AA";
		String actual = BWT(test);		
		assertEquals(expected, actual, "You did not transfrom properly into an encryption");
		actual = iBWT(actual);
		
		expected = "BANANA";
		assertEquals(expected, actual, "You did not transfrom properly into an decryption");
		
	}
	
	
	@Test
	//Test pulls off a transformation when a word has multiple spaces
	public void Spacestest() {
		String test = "Hello this is a test";
		System.out.println("Our word " + test);
		String expected = "ssaot$ Htt helliies  ";
		String actual = BWT(test);		
		assertEquals(expected, actual, "You did not transfrom properly into an encryption");
		actual = iBWT(actual);
		
		expected = "Hello this is a test";
		assertEquals(expected, actual, "You did not transfrom properly into an decryption");
	}
	
	@Test
	//Test pulls off a transformation with a word with multiple of the same letter to stress the LF Map
	public void Multiplevoweltest() {
		String test = "ABRACADABRA";
		System.out.println("Our word " + test);
		String expected = "ARD$RCAAAABB";
		String actual = BWT(test);		
		assertEquals(expected, actual, "You did not transfrom properly into an encryption");
		actual = iBWT(actual);
		
		expected = "ABRACADABRA";
		assertEquals(expected, actual, "You did not transfrom properly into an decryption");
	}
	

}

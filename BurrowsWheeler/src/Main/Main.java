package Main;

import java.util.*;

import javax.swing.JLabel;
//authors <Dean,Matt,Alex>
public class Main extends transform
{
	
	public String BWT(String word) {
		

		
		System.out.println("Burrows Wheeler Transformation: "+ (BurrowsWheeler(word)));
		

		return (BurrowsWheeler(word));

		
	}

	public String iBWT(String word) {
		
		System.out.println("Inverse Burrows Wheeler Transformation: " + inverseBurrowsWheeler(word));


		return (inverseBurrowsWheeler(word));
	
		
		
		
	}
	
	
	
}

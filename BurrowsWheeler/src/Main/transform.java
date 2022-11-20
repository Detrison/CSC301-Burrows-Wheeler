package Main;

import java.util.*;

//authors <Dean,Matt,Alex>
@SuppressWarnings("unused")
public class transform
{
	 private static final String Ending = "$";

	protected static String cycle(String s) 
	{
		int l = s.length();
		char move = s.charAt(l-1);
		String out = "";
		for (int y = 0; y < l; y ++)
		{
			if (y == 0) {
				out = out + move;
			}
			else {
				out = out + s.charAt(y-1);
			}
		}
		return out;
	}
	
	protected static String BurrowsWheeler(String f) {
		ArrayList<String> L = new ArrayList<String>();
		String g = f+Ending;
		String after = cycle(g);
		L.add(after);
		char m = g.charAt(g.length()-1);
		int count = 0;
		do
		{
			after = cycle(L.get(count));
			L.add(after);
			count++;
		}while (m != after.charAt(after.length()-1));
		
		L.sort(null);
	
		String first = "";
		String BWT = "";
		String iBWT = "";
		
		for(int i = 0; i < L.size(); i++) {
			String wrd = L.get(i);
			first += wrd.charAt(0);
			BWT += wrd.charAt(L.size()-1);
		}
		
		return(BWT);

		
		
	}
	
	protected static String inverseBurrowsWheeler(String h) {
		
		
        List<String> table = new ArrayList<>();
        for (int i = 0; i < h.length(); ++i) {
        	table.add("");
        
        }
        for (int j = 0; j < h.length(); ++j) {
            for (int i = 0; i < h.length(); ++i) {
                table.set(i, h.charAt(i) + table.get(i));
               
            }
           
            table.sort(String::compareTo);
           
        }
        for(String iBWT:table) {
        	if(iBWT.endsWith(Ending)) {
        		return iBWT.substring(0, h.length() -1);
        	}
        }
        
        System.out.print(table);
        
         
	return h;
}
	
	
	
	
}



	
	

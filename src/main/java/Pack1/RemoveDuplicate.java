package Pack1;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
	
public static void main(String[] args) {
	
	
}
public static String removeDuplicate(String s) {
		
	
		Set<Character> se = new HashSet<Character>();
		
		StringBuilder sb = new StringBuilder(s);
		
		for(int i = 0; i< sb.length(); i++) {
			if(se.contains(sb.charAt(i))) {
				sb.deleteCharAt(i);
				i--;
			
		} else {
			se.add(sb.charAt(i));
		}
		
	}
		return sb.toString();
 
}
}

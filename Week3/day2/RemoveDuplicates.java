package Week3.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String Companyname = "google";
		
		Set<Character> unique = new LinkedHashSet<Character>();
		
		char[] company = Companyname.toCharArray();
		for (int i = 0; i < company.length; i++) {
			
			unique.add(company[i]);			
			
			
		}
		System.out.println(unique);
		
		

	}

}

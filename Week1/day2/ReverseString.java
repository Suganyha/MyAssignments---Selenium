package Week1.day2;

public class ReverseString {

	public static void main(String[] args) {
		
		String name="Testleaf";
		char[] charArray = name.toCharArray();
				
		for (int i = charArray.length-1; i >=0 ; i--) {
			System.out.print(charArray[i]);
			
			
		}
		

	}

}

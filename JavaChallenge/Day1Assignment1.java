package JavaChallenge;

public class Day1Assignment1 {

	public static void main(String[] args) {
		
		String s = "Hello World";
		String replaceAll = s.replaceAll(" ", "");
		String substring = replaceAll.substring(5);
		int length = substring.length();
		System.out.println("The last word is " + substring  + " and the length is " +  length);	
		

	}
	
}

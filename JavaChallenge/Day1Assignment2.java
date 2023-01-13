package JavaChallenge;

public class Day1Assignment2 {

	public static void main(String[] args) {
		
		String s1 = "   fly me   to   the moon  ";
		String replaceAll = s1.replaceAll(" ", "");
		System.out.println(replaceAll);
		String substring = replaceAll.substring(10);
		System.out.println(substring);
		int length = substring.length();
		System.out.println(length);
		
		

	}

}

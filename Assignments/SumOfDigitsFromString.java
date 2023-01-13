package Assignments;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		String text = "Tes12Le79af65";
		String t1 = text.replaceAll("[a-zA-Z]", "");
		char[] word = t1.toCharArray();
		int sum = 0;
		for (int i = 0; i < word.length; i++) {
			sum = sum + Character.getNumericValue(word[i]);
		}
		System.out.println(sum);
	}

}
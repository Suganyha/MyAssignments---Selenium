package Assignments;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester"; 
		String word="";
		String[] t = test.split(" ");
				for (int i = 0; i < t.length; i++) {
			if (i%2==1)
				word = word + new StringBuilder(t[i]).reverse().toString() + " ";
		    else
		        word = word + t[i] + " ";
		}
		word = word.trim();
		System.out.println(word);
			
			
		}
		

	}



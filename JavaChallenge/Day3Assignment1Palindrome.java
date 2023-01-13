package JavaChallenge;

public class Day3Assignment1Palindrome 

{

	public static void main(String[] args)
	
	{
		
	String	s = "A man, a plan, a canal: Panama";
	String reverse="";
	
	String Word = s.replaceAll("[^a-zA-Z]","").replace(" ", "");
	//System.out.println(replaceAll);
	
	String lowerCase = Word.toLowerCase();
	//System.out.println(lowerCase);
	
	char[] charArray = lowerCase.toCharArray();
	
		for (int i = charArray.length-1; i >=0; i--)
		{
			reverse = reverse + charArray[i];
			//System.out.println(reverse);
			//break;
		}
		if(lowerCase.equals(reverse))
		{
			System.out.println("It's a Palindrome");
		}else
		{
			System.out.println("Not a Palindrome");
		}
		
			
		
	}
	

	
}



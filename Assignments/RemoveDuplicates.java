package Assignments;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
	String text = "We learn java basics as part of java sessions in java week1";
	countWords(text);
	
	}
	
	static void countWords(String st)
	{
		
		String[] words = st.split(" ");
				
		for (int i = 0; i < words.length; i++)
		{
			for (int j = i+1; j < words.length; j++)
			{
				if (words[i].equals(words[j]))
				{
					if (i != j)
						words[i] = " ";
 
				}
			}
		}
 
		for (int i = 0; i < words.length; i++)
		{
 
			if (words[i] != "")
			{
				System.out.print(words[i]+" ");
 
			}
		}
	}
}
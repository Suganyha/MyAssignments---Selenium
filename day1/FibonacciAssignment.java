package Week1.day1;

public class FibonacciAssignment {

	public static void main(String[] args) {
		
		int firstNum=0;
		int secondNum=1;
		int sum=0;
				
		System.out.print(firstNum + ",");
		System.out.print(secondNum + ",");
		
		for (int i=1; i < 11; i++) {
			
		sum=firstNum+secondNum;
		System.out.print(sum + ",");
		firstNum=secondNum;
		secondNum=sum;
		
		}

	}

}
